public class Scrabble {

    public static void main(String[] args) {

        String strOne = "quijibo";
        String strTwo = "jiboo";

        if (canSpellTest(strOne, strTwo)) { // function returns either true or false

            System.out.println("[Can Spell Second String]");

        }

        else {

            System.out.println("[Cannot Spell Second String]");

        }

    }

    public static boolean canSpell(String strOne, String strTwo) { // method that compares the two Strings

        boolean canSpell = false; // false by default

        int matchCount = strTwo.length(); // stores how many times a char is found inside another String

        for (int i = 0; i < strOne.length(); i++) { // iterates through first String

            for (int j = i; j < strTwo.length(); j++) { // iterates through second String

                if (strTwo.charAt(j) == strTwo.charAt(i)) {
                    // checks if the current char is similar to any of the characters in the first
                    // String

                    matchCount = matchCount + 1; // add one to matchCount if there is a match
                    break; // breaks out of loop

                }

            }

        }

        if (matchCount > strTwo.length()) { // if the match count

            canSpell = true;

        }

        return canSpell; // returns eiter true or false

    }

    public static boolean canSpellTest(String strOne, String strTwo) {

        int MAX_CHAR = 256;

        // Count occurrences of all
        // characters in strOne.
        int[] freq = new int[MAX_CHAR]; // now contains 256 bits or zeroes

        for (int i = 0; i < strOne.length(); i++) {

            freq[strOne.charAt(i)]++; // increments the bit position of that character

        }

        // Check if number of occurrences of
        // every character in strTwo is less than
        // or equal to that in strOne.
        for (int i = 0; i < strTwo.length(); i++) { // iterates through second String

            freq[strTwo.charAt(i)]--; // decrements number with corresponding position in the array

            if (freq[strTwo.charAt(i)] < 0) { // if the decremented number becomes negative, return false

                return false;

            }

        }

        return true; // return true if decremented number is not negative

    }

}
