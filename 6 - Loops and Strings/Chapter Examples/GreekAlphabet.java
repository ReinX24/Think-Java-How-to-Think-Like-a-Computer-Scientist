public class GreekAlphabet {

    public static void main(String[] args) {

        System.out.println("Greek Alphabet: ");
        System.out.println("---------------");

        int breakNum = 0;

        for (int i = 913; i <= 937; i++) {

            System.out.print((char) i + " "); // converts the number to their unicode equavalent
            breakNum++; // increments breakNum by 1

            if (breakNum == 8) {

                System.out.println(); // breaks print statement into a new line
                breakNum = 0; // resets break line counter to 0

            }

        }

        System.out.println("\n---------------");

    }

}
