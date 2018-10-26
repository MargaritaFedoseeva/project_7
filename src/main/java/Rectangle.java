public class Rectangle extends Calculator {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    public double calculationSquare() {
        return getA()*getB();
    }

    public double calculationPerimeter() {
        return (getA()+getB())*2;
    }
}
