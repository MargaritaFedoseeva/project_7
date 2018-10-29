import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
    @Test(expected = ExceptionPartiesNotNegative.class)
    public void testExceptionRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(3,-2);
        rectangle.calculationPerimeter();
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testExceptionRectanglePerimeterExpectMessage(){
        Rectangle rectangle = new Rectangle(3,-2);
        exception.expect(ExceptionPartiesNotNegative.class);
        exception.expectMessage("Сторона прямоугольника 'b' не может быть отрицательна");
        rectangle.calculationPerimeter();
    }

    @Test(expected = ExceptionPartiesNotNegative.class)
    public void testExceptionRectangleSquare(){
        Rectangle rectangle = new Rectangle(-3,2);
        rectangle.calculationSquare();
    }

    @Test
    public void testExceptionRectangleSquareExpectMessage(){
        Rectangle rectangle = new Rectangle(-3,2);
        exception.expect(ExceptionPartiesNotNegative.class);
        exception.expectMessage("Сторона прямоугольника 'a' не может быть отрицательна");
        rectangle.calculationSquare();
    }
}
