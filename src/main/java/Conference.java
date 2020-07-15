import java.util.ArrayList;

public class Conference {

    private int capacity;
    private String name;
    private ArrayList<Guest> occupants;

    public Conference(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.occupants = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Guest> getOccupants() {
        return occupants;
    }
}
