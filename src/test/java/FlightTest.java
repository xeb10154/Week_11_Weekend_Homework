import org.junit.Before;
import org.junit.Test;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        flight1 = new Flight(plane1, "GLA123", "Glasgow", "Edinburgh", "2018-11-18T10:30:35+00:00");
    }

    @Test
    public void bookPassengerTest(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        assertEquals(2, flight1.getNumPassengers());
    }

    @Test
    public void availableSeats(){
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        assertEquals(2, flight1.availableSeats());
    }

    @Test
    public void getDateTest(){
        String strTime = "Sun Nov 18 10:30:35 GMT 2018";
        SimpleDateFormat parser = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        Date date = parser.parse(strTime, new ParsePosition(0));
        assertEquals(date, flight1.getDate());
    }


}
