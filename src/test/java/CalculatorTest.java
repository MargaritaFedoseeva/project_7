
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    void testTriangleCalculationPerimeter() {
        Triangle triangle = new Triangle(2, 3, 1);
        assertEquals(6, triangle.calculationPerimeter(), 0);
    }

    @Test
    void testTriangleCalculationSquare() {
        Triangle triangle = new Triangle(3, 8);
        assertTrue( triangle.calculationSquare() == 12,"При вычислении площади треугольника получина ошибка. Получено значение " + triangle.calculationSquare() + ". Ожидалось 12!");
    }


    @Test
    void testCircleCalculationPerimeter() {
        Circle circle = new Circle(2);
        assertEquals(12, circle.calculationPerimeter(), 0.6);
    }

    @Test
    void testCircleCalculationSquare() {
        Circle circle = new Circle(2);
        assertEquals(12, circle.calculationSquare(), 0.6);
    }

}
