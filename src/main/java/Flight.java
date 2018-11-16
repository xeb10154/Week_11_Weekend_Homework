import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureDest;
    private String departureTime;


    public Flight(Plane plane, String flightNo, String destination, String departureDest, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureDest = departureDest;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public int getNumPassengers() {
        return passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger (Passenger passenger) {
        if(this.passengers.size() < this.plane.getCapacity()){
            this.passengers.add(passenger);
        }
    }

    public int availableSeats(){
        int availableSeats = this.plane.getCapacity() - this.passengers.size();
        return availableSeats;
    }

}
