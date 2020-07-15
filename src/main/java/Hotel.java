import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<Conference>();
    }

    public void checkGuestInBedroom(Guest guest, Bedroom bedroom){
        bedroom.addGuestToRoom(guest);
    }

    public void checkGuestOutBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuestFromRoom(guest);
    }
}

