public class ForLoop {

    public static void main(String[] args) {

        // Cheer loop using for loop

        for (int i = 2; i <= 8; i += 2) {

            System.out.print(i + ", ");

            if (i == 8) {
                // When i is 8, print message
                System.out.println("Who do we appreciate?");

            }

        }

        // Blast off for loop

        for (int i = 3; i > 0; i--) {

            System.out.print(i + ", ");

            if (i == 1) {

                System.out.println("Blast off!");

            }

        }

        // Using external variables in for loop

        int j = 9;

        for (j = 3; j > 0; j--) {

            if (j == 3) {

                System.out.println("Start your engines!");

            }

            System.out.print(j + ", ");

            if (j == 1) {

                System.out.println("\nGo!"); 
                // \n because it prints on the same line when printing numbers

            }

        }

        System.out.println("J is now: " + j);

    }

}
