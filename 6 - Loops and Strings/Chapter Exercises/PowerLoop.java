public class PowerLoop {

    public static void main(String[] args) {

        System.out.println(powerNum(5, 2)); // 5 to the power of 2, equals to 25

    }

    public static double powerNum(double x, int n) {

        double numResult = 1; // store result in numResult

        for (int i = 0; i < n; i++) { // for loop that loops in respect to n (in example above it runs 2 times)

            numResult *= x;

            /*
             * 1st Iteration
             * i = 0
             * 1 = 1 * 5
             * 5
             * 2nd Iteration
             * i = 1
             * 5 = 5 * 5
             * 25
             * 3rd Iteration
             * i = 2 (breaks for loop)
             * return the result (25)
             * 
             */

        }

        return numResult;

    }

}
