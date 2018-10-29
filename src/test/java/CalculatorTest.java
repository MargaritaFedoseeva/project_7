import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testTriangleCalculationPerimeter() {
        Triangle triangle = new Triangle(2,3,1);
        Assert.assertEquals(6, triangle.calculationPerimeter(), 0);
    }

    @Test
    public void testTriangleCalculationSquare() {
        Triangle triangle = new Triangle(3,8);
        Assert.assertTrue("При вычислении площади треугольника получина ошибка. Получено значение "+triangle.calculationSquare()+". Ожидалось 12!", triangle.calculationSquare()==12);
    }


    @Test
    public void testRectangleCalculationPerimeter() {
        Rectangle rectangle = new Rectangle(2,3);
        Assert.assertEquals(10, rectangle.calculationPerimeter(), 0);
    }
    @Test
    public void testRectangleCalculationSquare() {
        Rectangle rectangle = new Rectangle(3,2);
        Assert.assertEquals(6, rectangle.calculationSquare(), 0);
    }

    @Test
    public void testCircleCalculationPerimeter() {
        Circle circle = new Circle(2);
        Assert.assertEquals(12, circle.calculationPerimeter(), 0.6);
    }
    @Test
    public void testCircleCalculationSquare() {
        Circle circle = new Circle(2);
        Assert.assertEquals(12, circle.calculationSquare(), 0.6);
    }

}
