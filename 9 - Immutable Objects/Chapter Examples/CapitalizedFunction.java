public class CapitalizedFunction {

    public static void main(String[] args) {

        String strOne = ""; // no length
        String strTwo = null;
        String strThree = "hello";
        String strFour = "Goodbye";
        System.out.println(isCapitalized(strOne)); // false
        System.out.println(isCapitalized(strTwo)); // false
        System.out.println(isCapitalized(strThree)); // false
        System.out.println(isCapitalized(strFour)); // true

    }

    /*
     * String that will we will check if capitalized or not
     * Returns a boolean depending if the first character in String is capitalized
     * or not
     * 
     */
    public static boolean isCapitalized(String strOne) {
        if (strOne == null || strOne.length() == 0) {
            System.out.println("[String is null or has no characters]");
            return false;
        } else {
            return Character.isUpperCase(strOne.charAt(0)); // checks of the first letter is capitalized
        }
    }

}
