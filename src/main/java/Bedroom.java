import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private int rate;
    private ArrayList<Guest> occupants;

    public Bedroom(int roomNumber, int capacity, String type, int rate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.occupants = new ArrayList<Guest>();

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return type;
    }

    public int getRoomRate() {
        return rate;
    }
    public void addGuestToRoom(Guest guest){
        occupants.add(guest);
    }

    public int checkCurrentOccupancy() {
        return occupants.size();
    }

    public void removeGuestFromRoom(Guest guest) {
        occupants.remove(guest);
    }
}
