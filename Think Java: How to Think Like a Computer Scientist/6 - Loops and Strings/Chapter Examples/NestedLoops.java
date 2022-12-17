public class NestedLoops {

    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {

            for (int y = 1; y <= 10; y++) {

                System.out.printf("%4d", x * y); // shows the product of x & y
                // %4d places spaces before each number
                
                /*
                 * Explanation:
                 * Outer loop starts with one, inner loop start with one
                 * 1 * 1 = 1
                 * 1 * 2 = 2
                 * 1 * 3 = 3
                 * ...
                 * All in one line with 4 spaces before each number until y reaches 10
                 * 
                 * Outer loop = 2
                 * 2 * 1 = 2
                 * 2 * 2 = 4
                 * 2 * 3 = 6
                 * ...
                 * All in one line again
                 * 
                 * 
                 */

            }

            System.out.println(); // breaks print statement into new line when the inner for loop breaks

        }

        // Creating my own number table

        System.out.println("****************************************");

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j<= 10; j++) {

                System.out.printf("%4d", i * j);

            }

            System.out.println(); // new line after inner loop

        }

    }

}
