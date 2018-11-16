import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane1;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void setup(){
        plane1 = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Raymond", 2);
        passenger2 = new Passenger("Leah", 1);
    }

    @Test
    public void getTypeTest(){
        assertEquals("BOEING747", plane1.planeType().name());
    }

    @Test
    public void getWeightTest(){
        assertEquals(300, plane1.planeType().getWeight());
    }

    @Test
    public void getCapacityTest(){
        assertEquals(3, plane1.planeType().getCapacity());
    }


}
