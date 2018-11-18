import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureDest;
    private Date departureTime;


    public Flight(Plane plane, String flightNo, String destination, String departureDest, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureDest = departureDest;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        TemporalAccessor accessor = timeFormatter.parse(departureTime);
        Date date = Date.from(Instant.from(accessor));
        this.departureTime = date;
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getNumPassengers() {
        return passengers.size();
    }

    public void bookPassenger (Passenger passenger) {
        if(this.passengers.size() < this.plane.getCapacity()){
            this.passengers.add(passenger);
        }
    }

    public Date getDate(){
        return this.departureTime;
    }

    public int availableSeats(){
        int availableSeats = this.plane.getCapacity() - this.passengers.size();
        return availableSeats;
    }

    public int totalBags(){
        int totalBags = 0;

        for(Passenger passenger:this.getPassengers()){
            totalBags += passenger.getBags();
        }

        return totalBags;
    }


}