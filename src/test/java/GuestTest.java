import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1, guest2;

    @Before
    public void before (){
        guest1 = new Guest ("Joe");
        guest2 = new Guest ("Keith");
    }

    @Test
    public void checkGuestName(){
        assertEquals("Joe", guest1.getName());
    }



}
