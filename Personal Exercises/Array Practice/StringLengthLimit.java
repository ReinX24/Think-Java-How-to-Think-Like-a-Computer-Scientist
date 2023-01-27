public class StringLengthLimit {

    public static void main(String[] args) {

        /*
         * Exercise that will only add elements to the new array if an element in
         * another array has a String length of 4 or less
         * 
         */

        // We will print all elements that have a length of 4 or less to a new array
        // from this array
        String[] strArrOne = { "Omen", "Breach", "KAYO", "Reyna", "Fade", "Killjoy", "Chamber", "Neon", "Jett" };

        int newArrLength = 0; // where length of our new array will be stored

        for (int i = 0; i < strArrOne.length; i++) { // for loop to find needed length for new array

            newArrLength = strArrOne[i].length() <= 4 ? newArrLength = newArrLength + 1 : newArrLength;
            // incremets newArrLength by one if String lenght <= 4
            // Ternary Operator Explained, variable = condition ? if true : else false;

        }

        // Array where we will store our new variables
        String[] strArrTwo = new String[newArrLength]; // sets the array length to match the number of Strings
        int arrPos = 0; // new array position, used in the next for loop

        System.out.println("\n[Original Array]");
        for (int j = 0; j < strArrOne.length; j++) { // iterates through original array

            if (strArrOne[j].length() <= 4) { // if current elements characters are <= 4, add to new array

                strArrTwo[arrPos] = strArrOne[j];
                arrPos++; // increments after assigning for next index

            }

            // Shows elements of the old array
            System.out.println(" - " + strArrOne[j]); // prints each element of the old array

        }

        // Printing each element in the new array (strArrTwo)
        System.out.println("\n[New Array, 4 characters or less]");
        for (int k = 0; k < strArrTwo.length; k++) {

            System.out.println(" - " + strArrTwo[k]); // prints all of the elements in the new array

        }
        System.out.println(); // added for space

    }

}
