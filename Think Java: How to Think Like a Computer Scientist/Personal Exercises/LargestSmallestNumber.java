public class LargestSmallestNumber {

    public static void main(String[] args) {
        
        // We will first create an array that will contain numbers
        int[] myArray = {5, 4, 1, 8, 9, 10};

        // We will now try to find the largest number in the array
        int largestNum = myArray[0]; // we will start by initializing a variable
        System.out.println("Current number: " + largestNum); // shows the initial starting number

        for (int i = 0; i < myArray.length; i++) { // loop that will iterate through the array

            if (myArray[i] > largestNum) { // will run if the current number is bigger than largestNum

                largestNum = myArray[i]; // re-assigns new number to largestNum
                System.out.println("New largest number: " + largestNum);

            }

            else {

                System.out.println("Not larger than current number: " + myArray[i]);

            }

        }

        // Now we will find the smallest number in the array

        int smallestNum = myArray[0]; // variable that will hold the smallest number

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] < smallestNum) {

                smallestNum = myArray[i];
                System.out.println("New smallest number: " + smallestNum);

            }

            else {

                System.out.println("Not smaller than the current number: " + myArray[i]);

            }

        }

    }

}