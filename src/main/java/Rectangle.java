public class Rectangle implements Calculator {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculationSquare() {
        if(a<0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'a' не может быть отрицательна");
        else if(b<0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'b' не может быть отрицательна");
        return a * b;
    }

    public double calculationPerimeter() {
        if(a<0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'a' не может быть отрицательна");
        else if(b<0)
            throw new ExceptionPartiesNotNegative("Сторона прямоугольника 'b' не может быть отрицательна");
        return (a + b) * 2;
    }
}
