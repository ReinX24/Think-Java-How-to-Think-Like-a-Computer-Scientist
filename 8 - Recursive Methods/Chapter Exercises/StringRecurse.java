public class StringRecurse {

    public static void main(String[] args) {

        /*
         * Exercise 8.7
         * 1. Write some code in main that tests each of these methods. Make sure
         * they work, and you understand what they do.
         * 
         * 2. Using these methods, and without using any other String methods,
         * write a method called printString that takes a string as a parameter
         * and displays the letters of the string, one on each line. It should be a
         * void method.
         * 
         * 3. Again using only these methods, write a method called printBackward
         * that does the same thing as printString but displays the string back-
         * ward (again, one character per line).
         * 
         * 4. Now write a method called reverseString that takes a string as a pa-
         * rameter and returns a new string as a return value. The new string
         * should contain the same letters as the parameter, but in reverse order:
         * String backwards = reverseString("coffee");
         * System.out.println(backwards);
         * The output of this example code should be as follows:
         * eeffoc
         * 
         * 5. A palindrome is a word that reads the same both forward and backward,
         * like “otto” and “palindromeemordnilap”. Here’s one way to test whether
         * a string is a palindrome:
         * A single letter is a palindrome, a two-letter word is a palin-
         * drome if the letters are the same, and any other word is a
         * palindrome if the first letter is the same as the last and the
         * middle is a palindrome.
         * 
         * Write a recursive method named isPalindrome that takes a String and
         * returns a boolean indicating whether the word is a palindrome.
         * 
         */

        System.out.println("[Print Each Character]");
        printString("Rein"); // prints String characters line by line
        System.out.println("[Reversed Each Character]");
        printBackward("Rein"); // reversed String characters line by line
        System.out.println("[Reversed Entire String]");
        System.out.println(reverseString("Keyboard"));
        System.out.println("[Palindrome Checker]");
        System.out.println("Is [otto] a Palindrome: " + isPalindrome("otto"));
        System.out.println("Is [mouse] a Palindrome: " + isPalindrome("mouse"));

    }

    // Returns first character in a String
    public static char firstCharStr(String myStr) {
        return myStr.charAt(0);
    }

    // Returns entire String except for the first character
    public static String restStr(String myStr) {
        return myStr.substring(1);
    }

    // Returns String without starting and ending character
    public static String middleStr(String myStr) {
        return myStr.substring(1, myStr.length() - 1); // include first index, exclude second
    }

    // Returns the length of the given String
    public static int lengthStr(String myStr) {
        return myStr.length();
    }

    // Prints entire String using existing methods, one character per line
    public static void printString(String myStr) {
        if (lengthStr(myStr) > 0) { // check if the String contains any characters
            System.out.println(firstCharStr(myStr)); // prints first String
            printString(restStr(myStr));
        }
    }

    // Prints entire String backwards, one character per line
    public static void printBackward(String myStr) {
        if (lengthStr(myStr) > 0) {
            printBackward(restStr(myStr));
            System.out.println(firstCharStr(myStr));
        }
    }

    // Returns entire String backwards in one line
    public static String reverseString(String myStr) {
        if (lengthStr(myStr) > 0) {
            String reversedString = reverseString(restStr(myStr));
            return reversedString + firstCharStr(myStr);
        } else {
            return "";
        }
    }

    // Checks if the word is a Palindrome or not
    public static boolean isPalindrome(String myStr) {
        boolean isPalindrome = true; // true by default

        if (lengthStr(myStr) > 0) { // if there are characters in the String
            // Checking if the first character is the same as the last
            String reversedPalindromeString = reverseString(myStr); // returns Reversed String
            char firstChar = firstCharStr(myStr); // returns first char of current String
            char lastChar = firstCharStr(reversedPalindromeString); // returns first char of the Reversed String

            if (lengthStr(middleStr(myStr)) % 3 == 0) { // if the String length is divisible by 3
                isPalindrome = isPalindrome(middleStr(myStr));
            } else if (lengthStr(middleStr(myStr)) % 2 == 0) {
                isPalindrome = isPalindrome(middleStr(myStr));
            } else if (lengthStr(middleStr(myStr)) == 1) { // if there is only 1 character
                isPalindrome = true;
            } else {
                isPalindrome = true;
            }

            if ((firstChar == lastChar) && isPalindrome) { // checks if the myStr is a Palindrome
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        } else {
            isPalindrome = true;
        }

        return isPalindrome;

    }

}
