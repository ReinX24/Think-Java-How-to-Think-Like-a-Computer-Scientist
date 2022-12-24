import java.util.Random;

public class RandomArrays {

    public static void main(String[] args) {

        /*
         * Creating a method that takes a number as a parameter and return random
         * values between 0 and 99, value count will depend on number in parameter.
         * 
         */

        int[] ranArrOne = randomArray(10);
        int[] ranArrTwo = randomArray(20);

        // Printing elements of first array
        System.out.println("[Random Number Array One]");
        System.out.print("{ ");

        for (int i = 0; i < ranArrOne.length; i++) {

            if (i != ranArrOne.length - 1) { // if the current element is not the last element

                System.out.print(ranArrOne[i] + ", "); // prints element then a comma

            }

            else { // if at the last element, print closing bracket

                System.out.println(ranArrOne[i] + " }");

            }

        }

        // Printing elements of second array
        System.out.println("[Random Number Array Two]");
        System.out.print("{ ");

        for (int i = 0; i < ranArrTwo.length; i++) {

            if (i != ranArrTwo.length - 1) { // if the current element is not the last element

                System.out.print(ranArrTwo[i] + ", "); // prints element then a comma

            }

            else { // if at the last element, print closing bracket

                System.out.println(ranArrTwo[i] + " }");

            }

        }

    }

    public static int[] randomArray(int arrSize) {

        Random ranOne = new Random(); // random object to access random methods
        int[] myArr = new int[arrSize]; // array that will hold the random numbers

        for (int i = 0; i < myArr.length; i++) { // for loop that adds random numbers to the array

            myArr[i] = ranOne.nextInt(100); // adds random numbers between 0 and 100 (includes 0 but excludes 100)

        }

        return myArr; // returns the array with random numbers

    }

}
