
/*
sin(x) = x/1!-x^3/3!+x^5/5!-...+
 */

public class SinusCalculator {

    /*
    Calculation of a sine cycle for with a required degree of accuracy
     */
    public double calculateUsingForLoop(int x, int degreeOfAccuracy) {
        double result = x;    //   x/1! = x
        double numerator = x;
        double denominator = 1d;
        for (int currentAddend = 3; currentAddend <= degreeOfAccuracy; currentAddend += 2) {
            numerator *= x * x;
            numerator = -numerator;
            denominator *= currentAddend * (currentAddend - 1);
            result += numerator / denominator;
        }
        return result;
    }

    /*
    Calculation of a sine cycle while a required precision
     */
    public double calculateUsingWhileLoop(int x, double precision) {
        double numerator = x;
        double denominator = 1d;
        double currentResult = numerator / denominator;    //   1! = 1
        double result = currentResult;
        int currentAddend = 3;
        while (Math.abs(currentResult) > precision) {
            numerator *= -x * x;
            denominator *= currentAddend * (currentAddend - 1);
            currentResult = numerator / denominator;
            result += currentResult;
            currentAddend += 2;
        }
        return result;
    }
}
