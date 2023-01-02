public class FibonacciRecur {

    public static void main(String[] args) {
        System.out.println(fibonacciRecur(7)); // finds the 7th number in the Fibonacci sequence
    }

    public static int fibonacciRecur(int fibNum) {
        if (fibNum == 1 || fibNum == 2) { // if fibNum is 1 or 2
            return 1; // returns 1
        }
        return fibonacciRecur(fibNum - 1) + fibonacciRecur(fibNum - 2); // if fibNum is not 1 or 2
    }

}
