import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Bedroom bedroom4;
    private Guest guest;
    private Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, 6, "double", 150);
        bedroom2 = new Bedroom(2, 4, "double", 150);
        bedroom3 = new Bedroom(3, 3, "double", 150);
        bedroom4 = new Bedroom(4, 1, "single", 175);
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
    @Test
    public void canCreateBooking(){
        Booking booking = hotel.createBooking(3,bedroom);
        assertEquals(3,booking.getNightsBooked());
    }

    @Test
    public void canCreateTotalBill(){
        Booking booking = hotel.createBooking(3,bedroom);
        assertEquals(450, hotel.createTotalBill(booking));
    }

    @Test
    public void canAddBedrooms(){
        hotel.addBedrooms(bedroom);
        hotel.addBedrooms(bedroom2);
        hotel.addBedrooms(bedroom3);
        hotel.addBedrooms(bedroom4);
        assertEquals(4, hotel.numberOfBedrooms());
    }


//    @Test
//    public void isRoomVacant(){
//        assertEquals();
//
//    }


}

