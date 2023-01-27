public class StringIteration {

    public static void main(String[] args) {

        /*
         * Iterate through the String/s using a for loop
         * 
         */

        String strOne = "Poggies";
        String strTwo = "Weirdchamp";

        // Iterating from start to end
        for (int i = 0; i < strOne.length(); i++) {

            System.out.println(strOne.charAt(i));

        }

        System.out.println("----------");

        // Iterating from end to start
        for (int i = strTwo.length() - 1; i >= 0; i--) { // loop that starts at the end of the String

            System.out.println(strTwo.charAt(i));

        }

        // Finding the last letter of a String
        char lastLetter = strOne.charAt(strOne.length() - 1);
        System.out.println("Last letter of " + strOne + " : " + lastLetter);
        lastLetter = strTwo.charAt(strTwo.length() - 1);
        System.out.println("Last letter of " + strTwo + " : " + lastLetter);

    }

}
