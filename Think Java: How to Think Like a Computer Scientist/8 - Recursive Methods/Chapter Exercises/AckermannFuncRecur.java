public class AckermannFuncRecur {

    public static void main(String[] args) {

        /*
         * Exercise 8.4 The goal of this exercise is to translate a recursive definition
         * into a Java method. The Ackermann function is defined for non-negative
         * integers as follows:
         * (Page 143)
         * 
         */

        System.out.println(AckFunc(0, 0)); // returns 1
        System.out.println(AckFunc(1, 0)); // returns 1
        System.out.println(AckFunc(1, 1)); // returns 2
        System.out.println(AckFunc(2, 2)); // returns 3

    }

    public static int AckFunc(int m, int n) {
        if (m == 0) { // first condition
            return n + 1;
        } else if (m > 0 && n == 0) { // second condition
            return AckFunc(m - 1, n);
        } else { // no condition checker needed since this is the last one
            return AckFunc(m - 1, AckFunc(m, n - 1));
        }
    }

}
