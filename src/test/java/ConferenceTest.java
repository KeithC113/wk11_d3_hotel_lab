import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference conference;

    @Before
    public void before(){
        conference = new Conference (50, "Terry Wogan Suite");
    }

    @Test
    public void getCapacity(){
        assertEquals(50, conference.getCapacity());
    }

    @Test
    public void getName(){
        assertEquals("Terry Wogan Suite", conference.getName());
    }


}
