public class CodingBatNoX {

    public static void main(String[] args) {
        System.out.println(noXFunction("xanax")); // removes all the 'x's in String

        /*
         * Explanation:
         * First we check if the String contains characters, if it does not contain
         * characters we then return an empty String. If the String has characters,
         * we then split the String into 2 parts, the first char of the String and
         * the rest of the String. After that, we call the function with the rest
         * of the String as a parameter. It does this until it goes to the last char,
         * which is an x. The function calls itself one more time but is now has a
         * length of 0. This will return an empty String that we will be using to Store
         * our String without the 'x's.
         * 
         * After returning an empty String, it then goes to the function where the last
         * 'x' is currently the firstChar, this will then return recurStr which has the
         * rest of the String. The function calls itself until it reaches the first 'x',
         * which then prompts returning the rest of the String without the 'x's.
         * 
         * Visualization:
         * xanax
         * x is stored in the first function but not yet evaluated
         * anax
         * a is stored as first char
         * nax
         * n first char
         * ax
         * a first char
         * x
         * x first char
         * No restStr, returns empty String
         * Function with ax only returns a
         * Return na (n + a from last function)
         * Return ana (a + n + a)
         * Return rest of the String only since first char is 'x' again.
         * 
         */
    }

    public static String noXFunction(String paraStr) {
        if (paraStr.length() == 0) {
            return ""; // if the String parameter is empty
        }
        // Splitting the String into 2 parts
        char firstChar = paraStr.charAt(0); // starting character
        String restStr = paraStr.substring(1); // Stores the rest of the String
        String recurStr = noXFunction(restStr); // recursive call to remove 'x's from the rest
        if (firstChar == 'x') { // if the first character is 'x', return recurStr
            return recurStr;
        } else {
            return firstChar + recurStr;
        }
    }

}
