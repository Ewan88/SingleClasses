import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class printerTest {

    Printer printer;

    @Before
    public void before(){ printer = new Printer(10, 10); }

    @Test
    public void canPrint(){
        printer.Print(2, 5); // 10
        assertEquals(0, printer.getSheets()); // should be empty
        assertEquals(0, printer.getTonerVolume());
    }

    @Test
    public void cannotPrint(){
        printer.Print(2, 10); // 20
        assertEquals(10, printer.getSheets()); // should still have 10 pages and 10 toner
        assertEquals(10, printer.getTonerVolume());
    }

    @Test
    public void canRefill(){
        printer.Print(2, 5);
        printer.Refill(10, 10);
        assertEquals(10, printer.getSheets());
        assertEquals(10, printer.getTonerVolume());
    }

}
