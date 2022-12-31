public class AnagramApp {

    public static void main(String[] args) {

        /*
         * Exercise 7.8 Two words are anagrams if they contain the same letters and the
         * same number of each letter. For example, “stop” is an anagram of “pots”,
         * “allen downey” is an anagram of “well annoyed”, and “christopher mayfield” is
         * an anagram of “hi prof the camel is dry”. Write a method that takes two
         * strings and checks whether they are anagrams of each other.
         * 
         */

        boolean boolOne = isAnagram("Pots", "Stop");
        System.out.println("Pots an anagram of Stop? > " + boolOne);

        boolean boolTwo = isAnagram("Allen downey", "Well annoyed");
        System.out.println("Allen downey anagram of Well annoyed? > " + boolTwo);

        boolean boolThree = isAnagram("Christopher mayfield", "Hi prof the camel is dry");
        System.out.println("Christopher mayfield anagram of Hi prof the camel is dry? > " + boolThree);

        boolean boolFour = isAnagram("Rein", "Near");
        System.out.println("Rein anagram of Near? > " + boolFour);

        boolean boolFive = isAnagram("Mousepad", "Pad");
        System.out.println("Mousepad anagram of Pad? > " + boolFive);

    }

    // Parameter that takes 2 Strings and checks if they are anagrams of each other
    public static boolean isAnagram(String strOne, String strTwo) {

        boolean isAnagram = true; // true by default
        strOne = strOne.replaceAll("\\s", ""); // removes spaces if any, \\s is whitespace to be replaced by ""
        strOne = strOne.toLowerCase(); // converts String to all lowercase characters
        strTwo = strTwo.replaceAll("\\s", "");
        strTwo = strTwo.toLowerCase();
        int[] charArr = new int[26]; // storing characters of the first String

        if (strOne.length() == strTwo.length()) { // checks if the lengths are the same, if true, run code below
            for (int i = 0; i < strOne.length(); i++) { // loops through first String
                int charIndex = strOne.charAt(i) - 'a'; // converts char to an int index
                charArr[charIndex]++; // increments char index in array
            }

            for (int i = 0; i < strTwo.length(); i++) { // loops through second String
                int charIndex = strTwo.charAt(i) - 'a'; // converts char to a corresponding int
                charArr[charIndex]--;

                if (charArr[charIndex] < 0) { // if one of the char indexes go below 0, they are not anagrams
                    isAnagram = false;
                    return isAnagram; // returns immediately
                }
            }

            return isAnagram; // returns true if none of the char indexes go below

        } else { // if the String lengths are not the same
            isAnagram = false;
            return isAnagram;
        }

    }

}
