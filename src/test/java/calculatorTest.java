import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class calculatorTest {

    Calculator calc;

    @Before
    public void before() { calc = new Calculator(); }

    @Test
    public void canAdd() { assertEquals(2, calc.Add(1, 1)); }

    @Test
    public void canSubtract() { assertEquals(1, calc.Subtract(2, 1)); }

    @Test
    public void canMultiply() { assertEquals(2, calc.Multiply(1, 2)); }

    @Test
    public void canDivide() { assertEquals(1.5, calc.Divide(3, 2), 0.01);}

}
