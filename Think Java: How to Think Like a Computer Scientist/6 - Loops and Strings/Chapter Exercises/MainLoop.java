public class MainLoop {

    public static void main(String[] args) {

        /*
         * Exercise 6.1
         * 
         */

        loopNum(10);

        /*
         * Output:
         * 10
         * 5
         * 6
         * 3
         * 4
         * 2
         * 1
         * 2
         * 1
         * 2
         * 1
         * ... (loops infinitely)
         * 
         */

    }

    public static void loopNum(int inpNum) {

        int i = inpNum; // assigns number in parameter to another variable

        while (i > 0) {

            System.out.println(i); // prints current number

            if (i % 2 == 0) { // checks if divisible by 2

                i /= 2; // divide number by 2

            }

            else { // if not divisible by 2

                i += 1; // add 1 to number

            }

        }

    }

}
