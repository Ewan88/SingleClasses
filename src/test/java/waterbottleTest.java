import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class waterbottleTest {

    WaterBottle bottle;

    @Before
    public void before(){ bottle = new WaterBottle(); }

    @Test
    public void canDrink(){
        bottle.Drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmpty(){
        bottle.Empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFill(){
        bottle.Fill();
        assertEquals(100, bottle.getVolume());
    }


}
