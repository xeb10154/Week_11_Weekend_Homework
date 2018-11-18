import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FlightManagerTest {

    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    FlightManager flightManager;

    @Before
    public void setup(){
        passenger1 = new Passenger("Raymond", 2);
        passenger2 = new Passenger("Leah", 3);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "GLA123", "Glasgow", "Edinburgh", "2018-11-18T10:30:20+00:00");
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flightManager = new FlightManager();
    }

    @Test
    public void totalBagsBooked(){
        assertEquals(5, flight.totalBags());
    }

    @Test
    public void calculateTotalBaggageWeight(){

        double totalWeight = flightManager.calcTotalWeight(flight);
        assertEquals(50, totalWeight, 0.01);
    }

    @Test
    public void calculateRemainingBaggageWeightOfFlight(){
        double remainingWeight = flightManager.remainingBaggageCapacity(flight);
        assertEquals(100, remainingWeight, 0.01);
    }

    @Test
    public void reservedWeightPerPassenger(){

        double reservedPerPassenger = flightManager.reservedWeightPerPassenger(flight);
        assertEquals(75, reservedPerPassenger, 0.01);
    }

    @Test
    public void reservedWeightPerPassenger__MorePassengers(){
        Passenger passenger3 = new Passenger("Rique", 3);
        Passenger passenger4 = new Passenger("John", 1);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        double reservedPerPassenger = flightManager.reservedWeightPerPassenger(flight);
        assertEquals(37.5, reservedPerPassenger, 0.01);
    }
}

