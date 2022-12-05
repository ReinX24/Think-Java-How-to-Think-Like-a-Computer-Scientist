public class PrintEveryFirstChar {

    public static void main(String[] args) {

        // Print every first character within the array

        // Array containing names
        String[] myFriends = { "Gab", "Gabrielle", "Kristianna", "Sofia", "Aaliyah", "Carina", "Geena", "Elijah" };

        // Array that will contain each character in the array
        char[] firstLetter = new char[myFriends.length]; // same length as the String array

        // Iterating through myFriends array
        System.out.print("Friend Array: ");
        for (int i = 0; i < myFriends.length; i++) {

            firstLetter[i] = myFriends[i].charAt(0); // every first character is added to the new array
            System.out.print("|" + myFriends[i] + "|");
           

        }

        System.out.print("\nFirst letter of each name: "); // new line at start to fix formatting
        // Iterating through firstLetter array
        for (char eachLetter : firstLetter) {

            System.out.print("|" + eachLetter + "|");

        }

        System.out.println(); // new line for better readability in console

    }

}
