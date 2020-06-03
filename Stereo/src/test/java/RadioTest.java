import org.junit.Before;
import components.radio.Radio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Panasony", "Listenbox", "Station 1");
    }

    @Test
    public void getMake() {
        assertEquals("Panasony", radio.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Listenbox", radio.getModel());
    }

    @Test
    public void getStation() {
        assertEquals("Station 1", radio.getStation());
    }


}
