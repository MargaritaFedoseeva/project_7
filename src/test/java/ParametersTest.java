
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParametersTest {
    @ParameterizedTest
    @CsvSource({"3,3,12", "6,2,16"})
    @DisplayName("Проверка нахождения периметра прямоугольника")
    void testMethodRectangleCalculationPerimeter(double a, double b, double result) {
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(result, rectangle.calculationPerimeter());
    }

    @ParameterizedTest
    @CsvSource({"3,3,9", "6,2,12"})
    @DisplayName("Проверка нахождения площади прямоугольника")
    void testMethodRectangleCalculationSquare(double a, double b, double result) {
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(result, rectangle.calculationSquare());
    }

    @ParameterizedTest
    @CsvSource({"2,12"})
    @DisplayName("Проверка нахождения периметра круга")
    void testMethodCircleCalculationPerimeter(double r, double result) {
        Circle circle = new Circle(r);
        assertEquals(result, circle.calculationPerimeter(),0.6);
    }

    @ParameterizedTest
    @CsvSource({"2,12"})
    @DisplayName("Проверка нахождения площади круга")
    void testMethodCircleCalculationSquare(double r, double result) {
        Circle circle = new Circle(r);
        assertEquals(result, circle.calculationSquare(),0.6);
    }

    @ParameterizedTest
    @CsvSource({"2,3,1,6","2,2,2,6","10,7,8,25"})
    @DisplayName("Проверка нахождения периметра треугольника")
    void testTriangleCalculationPerimeter(double a, double b,double c, double result) {
        Triangle triangle = new Triangle(a,b,c);
        assertEquals(result, triangle.calculationPerimeter());
    }

    @ParameterizedTest
    @CsvSource({"3,8,12"})
    @DisplayName("Проверка нахождения площади треугольника")
    void testTriangleCalculationSquare(double a, double b, double result) {
        Triangle triangle = new Triangle(a,b);
        assertEquals(result, triangle.calculationSquare());
    }
}
