public class Doubloon {

    public static void main(String[] args) {

        /*
         * A word is said to be a “doubloon” if every letter that appears
         * in the word appears exactly twice. Here are some example doubloons found
         * in the dictionary:
         * Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bil-
         * abial, boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horse-
         * shoer, intestines, Isis, mama, Mimi, murmur, noon, Otto, papa,
         * peep, reappear, redder, sees, Shanghaiings, Toto
         * Write a method called isDoubloon that takes a string and checks whether it is
         * a doubloon. To ignore case, invoke the toLowerCase method before checking.
         * 
         */

        // String[] strArr = {"Abba", "Anna", "appall", "appearer", appeases,
        // arraigning, beriberi, bil-
        // abial, boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horse-
        // shoer, intestines, Isis, mama, Mimi, murmur, noon, Otto, papa,
        // peep, reappear, redder, sees, Shanghaiings, Toto};

        String[] strArr = { "Abba", "Anna", "appall", "appearer", "mouse" };
        // added mouse to test false statement

        for (int i = 0; i < strArr.length; i++) {

            boolean isDoubloon = isDoubloon(strArr[i]);

            if (isDoubloon) { // if true, print code block below

                System.out.println(strArr[i] + " : is a doubloon!");

            }

            else {

                System.out.println(strArr[i] + " : not a doubloon...");

            }

        }

    }

    public static boolean isDoubloon(String inString) {

        inString.toLowerCase(); // converts all characters in the String to lowercase

        boolean isDoubloon = false; // false by default

        for (int i = 0; i < inString.length(); i++) { // loops through each character in a String

            char chOne = inString.charAt(i);

            for (int j = i + 1; j < inString.length(); j++) {
                // checks if the chars next to char in outer loop is similar to another one in
                // the String

                char chTwo = inString.charAt(j);

                if (chOne == chTwo) { // if outer char is the same with inner char loop, set isDoubloon to true

                    isDoubloon = true; // set isDoubloon to true

                }

            }

        }

        return isDoubloon; // returns either true or false

    }

}
