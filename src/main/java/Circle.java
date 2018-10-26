import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circle extends Calculator {
    public Circle(double r) {
        super(r);
    }

    public double calculationSquare() {
        return Math.PI*Math.pow(getR(),2);
    }

    public double calculationPerimeter() {
        return 2*Math.PI*getR();
    }
}
