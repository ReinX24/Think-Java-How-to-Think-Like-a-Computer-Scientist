public class ReverseString {

    public static void main(String[] args) {

        /*
         * Reverse the String using a function
         * 
         */

        String strOne = "Fracture";
        String strTwo = "Breeze";

        System.out.println("Normal: " + strOne);
        String reversedStrOne = reverseString(strOne);
        System.out.println("Reversed: " + reversedStrOne);

        System.out.println("**************************");

        System.out.println("Normal: " + strTwo);
        String reversedStrTwo = reverseString(strTwo);
        System.out.println("Reversed: " + reversedStrTwo);

    }

    public static String reverseString(String inStr) { // method that reverses a String and returns reversed String

        String reversedString = ""; // we will store our reverse String here

        for (int i = inStr.length() - 1; i >= 0; i--) { // loop that starts at the end of the String parameter

            reversedString += inStr.charAt(i); // adds each character to a new String variable

        }

        return reversedString; // returns reversed String

    }

}
