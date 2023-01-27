class LargestSmallestString {

    public static void main(String[] args) {

        String[] stringArray = { "Rein", "Aaliyah", "Kristianna", "Geena", "Sofia", "Gabrielle", "Gab" };

        // Finding the longest String inside the array

        String longestString = stringArray[0];

        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i].length() > longestString.length()) {
                // Checks if the current iterated String is larger than the String inside
                // longestString

                // If larger than the String in longestString, replace it with the current
                // iterated String

                longestString = stringArray[i];

            }

        }

        System.out.println("Largest String inside the array is: " + longestString);

        // Finding the shortest string inside the array
        String shortestString = stringArray[0];
        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i].length() < shortestString.length()) {

                // Checks if current iterated string is shorter than the String inside
                // shortestString

                shortestString = stringArray[i];

            }

        }

        System.out.println("Shortest String inside the array is: " + shortestString);

    }

}
