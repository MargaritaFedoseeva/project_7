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
        if (a < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'a' не может быть отрицательна");
        else if (b < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'b' не может быть отрицательна");
        return 0.5 * a * b;
    }

    public double calculationPerimeter() {
        if (a < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'a' не может быть отрицательна");
        else if (b < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'b' не может быть отрицательна");
        else if (c < 0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'b' не может быть отрицательна");
        return a + b + c;
    }
}
