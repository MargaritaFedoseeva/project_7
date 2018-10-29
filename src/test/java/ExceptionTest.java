import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
    @Test
    public void testException(){
        try {
            new Rectangle(3,-2);
            fail("Fail!!!");
        }catch (ExceptionPartiesNotNegative e){
            assertThat(e.getMessage(),is("Сторона прямоугольника 'b' не может быть отрицательна"));
        }
    }
}
