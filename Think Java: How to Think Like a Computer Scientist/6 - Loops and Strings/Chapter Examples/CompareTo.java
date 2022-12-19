public class CompareTo {

    public static void main(String[] args) {

        /*
         * Using the .compareTo method to compare the differences between String
         * 
         * In the example below, the second String must come first before the first
         * String, this is because in alphabetical order, d comes before l.
         * 
         * The difference is 8 because d is 8 letters away from l (includes l).
         * 
         */

        String nameOne = "Alan Turing";
        String nameTwo = "Ada Lovelace";

        int strDiff = nameOne.compareTo(nameTwo); // compares the two String and stores difference in strDiff

        String mapOne = "Fracture";
        String mapTwo = "Breeze";

        strDiff = mapTwo.compareTo(mapOne); // returns a negative number

        /*
         * This second strDiff returns a negative number because F is 4 letters after B.
         * Think if it as the one inside the parameters as the starting index of the
         * difference. If the letter comes before the index, it returns a negative
         * number, if after the index, then a positive number.
         * 
         */

        if (strDiff < 0) {

            System.out.println("First name comes before second name");
            System.out.println("Difference: " + strDiff);

        }

        else if (strDiff > 0) {

            System.out.println("Second name comes before the first name");
            System.out.println("Difference: " + strDiff);

        }

        else {

            System.out.println("The names are the same");

        }

    }

}
