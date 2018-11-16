import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane1;
    private Flight flight1;

    @Before
    public void setup(){

        passenger1 = new Passenger("Raymond", 2);
        passenger2 = new Passenger("Leah", 1);
        plane1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight(plane1, "GLA123", "Glasgow", "Edinburgh", "18:00");
    }

    @Test
    public void bookPassengerTest(){
        flight1.bookPassenger(passenger1);
        assertEquals(1, flight1.getNumPassengers());
    }

    @Test
    public void availableSeats(){
        flight1.bookPassenger(passenger1);
        assertEquals(2, flight1.availableSeats());
    }

}
