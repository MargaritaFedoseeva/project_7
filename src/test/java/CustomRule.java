import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class CustomRule implements TestRule {
    public Statement apply(final Statement statement, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {

                int a = 1;
                int b = 10;

                int random_number1 = a + (int) (Math.random() * b);

                int random_number2 = a + (int) (Math.random() * b);

                Rectangle rectangle = new Rectangle(random_number1, random_number2);
                statement.evaluate();
            }
        };
    }
}
