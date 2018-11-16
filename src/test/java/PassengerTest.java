import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup(){
        passenger = new Passenger("Raymond", 2);
    }

    @Test
    public void getPassengerDetails(){
        assertEquals("Raymond", passenger.getName());
        assertEquals(2, passenger.getBags());
    }


}
