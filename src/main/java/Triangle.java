public class Triangle extends Calculator {
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    public Triangle(double a, double b) {
        super(a, b);
    }

    public double calculationSquare() {
        return 1/2*getA()*getB();
    }

    public double calculationPerimeter() {
        return getA()+getB()+getC();
    }
}
