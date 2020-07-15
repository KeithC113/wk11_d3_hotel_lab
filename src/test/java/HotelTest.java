import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, 6, "double", 150);
        guest = new Guest("Joe");
    }

    @Test
    public void addGuestToRoom(){
        hotel.checkGuestInBedroom(guest, bedroom);
        assertEquals(1, bedroom.checkCurrentOccupancy());
    }
    

}

