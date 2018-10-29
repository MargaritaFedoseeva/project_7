public class Triangle implements Calculator {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculationSquare() {

        return 0.5 * a * b;
    }

    public double calculationPerimeter() {
        return a+b+c;
    }
}
