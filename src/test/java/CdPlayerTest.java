import components.cdPlayer.CdPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer("Samsapple", "Sonybox", 18);
    }

    @Test
    public void getMake() {
        assertEquals("Samsapple", cdPlayer.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("Sonybox", cdPlayer.getModel());
    }

    @Test
    public void getNumberOfCds() {
        assertEquals(18, cdPlayer.getNumberOfCds());
    }
}
