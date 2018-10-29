import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class CalculatorTestRectangle {
    Random random = new Random();
    @Rule
    public Rectangle rectangle = new Rectangle(random.getRandom_number1(), random.getRandom_number2());


    @Test
    public void testRectangleCalculationPerimeter() {
        Assert.assertEquals((random.getRandom_number1() + random.getRandom_number2()) * 2, rectangle.calculationPerimeter(), 0);
    }

    @Test
    public void testRectangleCalculationSquare() {
        Assert.assertEquals(random.getRandom_number1() * random.getRandom_number2(), rectangle.calculationSquare(), 0);
    }

//    @Test
//    public void testCircleCalculationPerimeter() {
//        Circle circle = new Circle(2);
//        Assert.assertEquals(12, circle.calculationPerimeter(), 0.6);
//    }
//
//    @Test
//    public void testCircleCalculationSquare() {
//        Circle circle = new Circle(2);
//        Assert.assertEquals(12, circle.calculationSquare(), 0.6);
//    }

}
