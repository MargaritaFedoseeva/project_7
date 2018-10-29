import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametersTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, 2,12}, {2, 2,8}
        });
    }

    @Parameterized.Parameter
    public double number1;
    @Parameterized.Parameter(1)
    public double number2;
    @Parameterized.Parameter(2)
    public double result;

    @Test
    public void testMethodRectangleCalculationPerimeter() {
        Assert.assertEquals(result, new Rectangle(number1, number2).calculationPerimeter(), 0.0);
    }
}
