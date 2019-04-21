public class Main {

    public static void main(String[] args) {
        double result;
        int x = 5;
        int degreeOfAccuracy = 20;
        double precision = 0.001;
        System.out.println("Sinus calculator.");
        SinusCalculator sinusCalculator = new SinusCalculator();
        result = sinusCalculator.calculateUsingForLoop(x, degreeOfAccuracy);
        System.out.println("Sin(" + x + ")=" + result);
        result = sinusCalculator.calculateUsingWhileLoop(x, precision);
        System.out.println("Sin(" + x + ")=" + result);
    }
}
