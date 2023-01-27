import java.math.BigDecimal;

public class ExpoNum {

    public static void main(String[] args) {

        /*
         * Exercise 9.4 One way to calculate e x is to use the following infinite series
         * expansion. The ith term in the series is x i /i!.
         * 
         */

        System.out.println(factorialNum(5)); // for exercising factorials
        System.out.println(powerNum(5, 2)); // for exercising powers
        System.out.println(Math.exp(1)); // Euler's number raised to a number
        System.out.println(expNum(1, 17)); // Euler's number raised to a number
        compareResults(1);

        double checkNumPos = 0.1;
        while (checkNumPos <= 100.0) {
            compareResults(checkNumPos);
            checkNumPos *= 10;
        }

        double checkNumNeg = -0.1;
        while (checkNumNeg >= -100.0) {
            compareResults(checkNumNeg);
            checkNumNeg *= 10;
        }

    }

    public static double expNum(double x, int n) {
        double expNumTerm = 1;
        double expNumResult = 1;
        int i = 1;
        while (i <= n) {
            expNumTerm = expNumTerm * x / i;
            expNumResult = expNumResult + expNumTerm;
            i++;
        }
        return expNumResult;
    }

    public static void compareResults(double x) {
        System.out.println(x + "\t" + Math.exp(x) + "\t" + expNum(x, 17));
    }

    public static BigDecimal factorialNum(int x) {
        if (x == 0) {
            return BigDecimal.valueOf(1);
        }
        BigDecimal bigDecimalFac = factorialNum(x - 1);
        if (x > 0) {
            return bigDecimalFac.multiply(BigDecimal.valueOf(x));
        } else {
            return bigDecimalFac;
        }
    }

    public static BigDecimal powerNum(int x, int n) {
        if (n == 0) {
            return BigDecimal.valueOf(1);
        }
        BigDecimal bigDecimalPow = powerNum(x, n / 2);
        if (n % 2 == 0) {
            return bigDecimalPow.multiply(bigDecimalPow);
        } else {
            return bigDecimalPow.multiply(bigDecimalPow).multiply(BigDecimal.valueOf(x));
        }
    }

}
