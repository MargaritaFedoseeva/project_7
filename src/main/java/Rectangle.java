import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class Rectangle implements Calculator, TestRule {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculationSquare() {
        if (a < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'a' не может быть отрицательна");
        else if (b < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'b' не может быть отрицательна");
        return a * b;
    }

    public double calculationPerimeter() {
        if (a < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'a' не может быть отрицательна");
        else if (b < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'b' не может быть отрицательна");
        return (a + b) * 2;
    }

    public Statement apply(final Statement statement, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                statement.evaluate();
            }
        };
    }
}
