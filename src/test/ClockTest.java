import org.junit.Test;

import static org.junit.Assert.*;

public class ClockTest {
    @Test
    public void name() {
        assertEquals(61000, Clock.Past(0,1,1));
    }
}