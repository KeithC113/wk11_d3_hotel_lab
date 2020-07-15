import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom (1,6, "double",150);
        guest = new Guest ("Joe");
        guest2 = new Guest ("Keith");
    }

    @Test
    public void getRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void getCapacity(){
        assertEquals(6, bedroom.getCapacity());
    }
    @Test
    public void getRoomType(){
        assertEquals("double", bedroom.getRoomType());
    }

    @Test
    public void getRoomRate(){
        assertEquals(150, bedroom.getRoomRate());
    }
    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuestToRoom(guest);
        assertEquals (1,bedroom.checkCurrentOccupancy());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest2);
        bedroom.removeGuestFromRoom(guest);
        assertEquals(1, bedroom.checkCurrentOccupancy());
    }


}

