public  class Random {

    int a = 1;
    int b = 10;

    private double random_number1 = a + (int) (Math.random() * b);

    private double random_number2 = a + (int) (Math.random() * b);

    public double getRandom_number1() {
        return random_number1;
    }

    public double getRandom_number2() {
        return random_number2;
    }
}
