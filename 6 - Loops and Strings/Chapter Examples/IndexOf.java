public class IndexOf {

    public static void main(String[] args) {

        /*
         * The index of method finds the index location of a character inside a String
         * 
         */

        String strOne = "Bananas";

        int indOne = strOne.indexOf('a'); // finds the index of the first 'a' character in the String

        System.out.println("Index of first 'a': " + indOne);

        int indTwo = strOne.indexOf('a', 2); // Index of the second 'a'

        System.out.println("Index of second 'a': " + indTwo);

        int indThree = strOne.indexOf('a', 4); // Index of the third 'a'

        /*
         * 3 does not work because it is already the last index position of the last
         * indexOf method, to fix this, we use 4 which then returns 5, the position
         * of the next 'a' character.
         * 
         */

        System.out.println("Index of third 'a': " + indThree);

    }

}
