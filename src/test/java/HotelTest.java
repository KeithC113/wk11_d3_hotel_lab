import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, 6, "double", 150);
        guest = new Guest("Joe");
        guest2 = new Guest ("Keith");
    }

    @Test
    public void addGuestToRoom(){
        hotel.checkGuestInBedroom(guest, bedroom);
        assertEquals(1, bedroom.checkCurrentOccupancy());
    }
    @Test
    public void removeGuestFromRoom(){
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest2);
        hotel.checkGuestOutBedroom(guest, bedroom);
        assertEquals(1, bedroom.checkCurrentOccupancy());
    }



}

