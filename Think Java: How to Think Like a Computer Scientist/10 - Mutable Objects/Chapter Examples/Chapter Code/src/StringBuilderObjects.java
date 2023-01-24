import java.util.Scanner;

public class StringBuilderObjects {

    public static void main(String[] args) {

        Scanner scanOne = new Scanner(System.in); // for accepting user input
        StringBuilder textTotal = new StringBuilder(); // where we will store our String
        /* Asking for Strings for our StringBuilder */
        for (int i = 0; i < 10; i++) {
            String perLine = scanOne.nextLine();
            textTotal.append(perLine);
            textTotal.append("\n"); // breaks into new line
        }

        System.out.print("You have entered:\n" + textTotal);
        String textResult = textTotal.toString(); // converts textTotal to Strings and puts them in a variable
        System.out.println(textResult);
        scanOne.close(); // closes our Scanner object

    }

}
