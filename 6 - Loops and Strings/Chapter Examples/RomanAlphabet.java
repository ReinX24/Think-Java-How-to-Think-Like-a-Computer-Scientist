public class RomanAlphabet {

    public static void main(String[] args) {

        // For loop that prints all of the letters in the Roman alphabet

        int breakNum = 0;

        System.out.println("Roman Alphabet: ");
        System.out.println("---------------");

        for (char c = 'A'; c <= 'Z'; c++) {

            System.out.print(c + " ");
            breakNum++;

            if (breakNum == 8) { // if there are 6 numbers in a single print line, break into a new line

                System.out.println(); // breaks print statement into a new line
                breakNum = 0;

            }

        }

        System.out.println("\n---------------");

    }

}
