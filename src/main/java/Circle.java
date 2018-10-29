import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circle implements Calculator {
    private double r;

    public Circle(double r) {
        if(r<=0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'r' не может быть отрицательна");
        this.r = r;
    }

    public double calculationSquare() {
        return Math.PI * Math.pow(r, 2);
    }

    public double calculationPerimeter() {
        return 2 * Math.PI * r;
    }
}
