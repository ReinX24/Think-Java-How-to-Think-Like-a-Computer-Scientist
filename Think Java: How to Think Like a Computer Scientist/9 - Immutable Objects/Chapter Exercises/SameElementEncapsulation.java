public class SameElementEncapsulation {

    /**
     * @param args
     *             Tests if the charMatch method works accordingly.
     */
    public static void main(String[] args) {

        /*
         * Exercise 9.6 The following code fragment traverses a string and checks
         * whether it has the same number of opening and closing parentheses:
         * 
         */

        String strOne = "((3 + 7) * 2)";
        char MATCH_CHAR_ONE = '(';
        char MATCH_CHAR_TWO = ')';
        int strOneCount = charMatch(strOne, MATCH_CHAR_ONE, MATCH_CHAR_TWO);
        System.out.printf("%20s : %4d\n", strOne, strOneCount); // returns 0
        /*
         * strOne has an equal number of opening and closing parentheses so it returns
         * 0, which means the amount of open parentheses '(' are equal to the amount of
         * closing parentheses ')'.
         * 
         */

        int testCountOne = charMatch("test", 't', 'e');
        System.out.printf("%20s : %4d\n", "Test Count One", testCountOne);
        /*
         * Since thera are 2 't' chacters in "test" and only one 'e' character, it will
         * return 1 (2 - 1 = 1).
         * 
         */

        int testCountTwo = charMatch("pogchamp", 'c', 'p');
        System.out.printf("%20s : %4d", "Test Count Two", testCountTwo);
        /*
         * "pogchamp" has only 1 'c' character and 2 'p' characters, returns -1 (1 - 2 =
         * -1).
         * 
         */

    }

    /**
     * @param inputString
     *                      String that will be iterated through in the method.
     * @param MATCH_CHAR
     *                      MATCH_CHAR will be compared with each char in the
     *                      String, will increment counter if the char and the
     *                      current char in loop are equal to each other.
     * @param MISMATCH_CHAR
     *                      if the current char in String is equal to MISMATCH_CHAR,
     *                      decrement the counter.
     * @return
     *         returns charCount, the counter that we use to keep in track
     *         MATCH_CHAR and MISMATCH_CHAR occurences.
     */
    public static int charMatch(String inputString, char MATCH_CHAR, char MISMATCH_CHAR) {
        int charCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == MATCH_CHAR) {
                charCount++;
            } else if (inputString.charAt(i) == MISMATCH_CHAR) {
                charCount--;
            }
        }
        return charCount;
    }

}
