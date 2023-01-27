import java.util.Arrays;

public class Abecedarian {

    public static void main(String[] args) {

        /*
         * A word is said to be “abecedarian” if the letters in the word
         * appear in alphabetical order. For example, the following are all six-letter
         * English abecedarian words:
         * abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, be-
         * know, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos,
         * diluvy, dimpsy
         * Write a method called isAbecedarian that takes a String and returns a
         * boolean indicating whether the word is abecedarian.
         * 
         */

        String[] strArr = { "abdest", "acknow", "acorsy", "adempt", "adipsy", "agnosy", "befist", "behint", "be-know",
                "bijoux", "biopsy", "cestuy", "chintz", "deflux", "dehors", "dehort", "deinos", "diluvy", "dimpsy", "testing" };
        // Array that we will iterate through to find our identical string, added "testing" at the end to test false result

        // For loop that we will use to iterate through the Array

        for (int i = 0; i < strArr.length; i++) {

            boolean stringMatch = isAbecedarianSort(strArr[i]); // returns a boolean

            if (stringMatch) { // if true, run the code block below

                System.out.println("[Abecedarian!]");
                System.out.println("String : " + strArr[i]); // prints Abecedarian String

            }

            else { // if false, run the code blow below instead

                System.out.println("[NOT Abecedarian!]");
                System.out.println("String : " + strArr[i]);

            }

        }

    }

    public static boolean isAbecedarianSort(String inString) { // checking if word is in alphabetical order using arrays

        boolean isAlphabetical = false; // false by default

        // Put each character in the String in an array

        // char[] charArr = new char[inString.length()]; // array will have a size similar to String length

        // for (int i = 0; i < inString.length(); i++) { // for loop that adds each character in the String to the array

        //     charArr[i] = inString.charAt(i);

        // }

        char[] charArr = inString.toCharArray(); 
        // instead of using a for loop, we this toCharArray method instead that turns each character in the String into an array

        Arrays.sort(charArr); // sorts the array

        for (int i = 0; i < charArr.length; i++) { // for loop that iterates through our char array

            if (charArr[i] == inString.charAt(i)) { // checks if char index in the array is similar to String indexes

                isAlphabetical = true; // sets return variable to true

            }

            else { 
            // if any char in the sorted array does not have a similar index to the String, return false

                isAlphabetical = false;

            }

        }

        return isAlphabetical; // returns either true or false

    }

}
