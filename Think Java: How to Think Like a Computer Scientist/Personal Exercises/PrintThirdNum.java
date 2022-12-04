public class PrintThirdNum {

    public static void main(String[] args) {

        // Make an array and print every third number in that array

        int numCounter = 0;

        int[] numArray = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29 };

        for (int i = 0; i < numArray.length; i++) { // loop that iterates through the array

            if (numCounter == 2) { // prints if numCounter is equal to 2

                System.out.println("Third Number: " + numArray[i]);
                numCounter = 0; // resets num counter

            }

            else { // prints numbers that are not the third numbers

                System.out.println("Number: " + numArray[i]);
                numCounter++; // increments numCounter if not the third number

            }

        }

    }

}
