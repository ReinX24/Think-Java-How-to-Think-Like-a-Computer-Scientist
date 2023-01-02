public class CountUpRecur {

    public static void main(String[] args) {
        countUp(3);
        /*
         * Explanation:
         * Since the number is 3, it goes to another function where it is decreased by
         * one. Now it is 2 but we go to another function that decreases it to 1. Now it
         * is 1. 1 minus 1 equals to zero which prints our message. It then goes back to
         * the last function and prints 1, then prints 2, then prints 3.
         */
    }

    public static void countUp(int paraNum) {
        if (paraNum == 0) { // if the counter is at 0
            System.out.println("[Blast Off!]");
        } else {
            countUp(paraNum - 1); // repeats the function recursively
            System.out.println(paraNum); // prints the number
        }
    }

}
