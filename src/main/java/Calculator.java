public abstract class Calculator {
    private double a;
    private double b;
    private double c;
    private double r;

    public abstract double calculationSquare();
    public abstract double calculationPerimeter();

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(double r) {
        this.r = r;
    }


    public Calculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getR() {
        return r;
    }
}
