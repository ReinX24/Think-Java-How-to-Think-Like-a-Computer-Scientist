import java.util.InputMismatchException;
import java.util.Scanner;

class TempConverter {

    // Make a scanner input that will accept the values
    // Scanner is outside the main method for other methods or functions will use it
    static Scanner scanOne = new Scanner(System.in);

    public static void main(String[] args) {

        boolean converterRun = true;

        while (converterRun == true) {

            try {

                // Choice to convert celcius to fahrenheit or vice versa

                int userChoice = menuChoice();

                if (userChoice == 1) {

                    // Instantiate the variables as you ask user input
                    System.out.println("[Celcius to Fahrenheit Converter]");
                    System.out.print("Enter value you wish to convert: ");
                    float celciusTemp = scanOne.nextFloat();

                    // Convert celcius to fahrenheit

                    float fahrenheitTemp = celciusTemp * 9 / 5 + 32;

                    // // round off to nearest tenths

                    // fahrenheitTemp = Math.round(fahrenheitTemp * 100) / 100;

                    // Show the converted values

                    System.out.printf("Celcius: %.0f C\n", celciusTemp); // rounds off to a whole number
                    System.out.printf("Fahrenheit: %.1f F\n", fahrenheitTemp); // rounds off nearest tenths

                }

                else if (userChoice == 2) {

                    System.out.println("[Fahrenheit to Celcius Converter]");
                    System.out.print("Enter value you wish to convert: ");
                    float fahrenheitTemp = scanOne.nextFloat();

                    // Convert fahrenheit to celcius

                    float celciusTemp = (fahrenheitTemp - 32) * 5 / 9;

                    // Show the converted values

                    System.out.printf("Fahrenheit: %.1f F\n", fahrenheitTemp); // tenths
                    System.out.printf("Celcius: %.0f C\n", celciusTemp); // whole number

                }

                else if (userChoice == 3) {

                    System.out.println("[Converter turned off]");
                    scanOne.close(); // closes scanner
                    converterRun = false; // breaks the while loop

                }

                else {

                    System.out.println("[Number not a choice, try again]");
                    scanOne.nextLine();

                }

            }

            catch (InputMismatchException ex) {

                System.out.println("[Invalid input, try again]");
                scanOne.nextLine();

            }

            // scanOne.close(); // closes the scanner once the conversion is done
            // converterRun = false; // breaks the loop that keeps the program running

        }

    }

    public static int menuChoice() {

        System.out.println("[1] Celcius to Fahrenheit");
        System.out.println("[2] Fahrenheit to Celcius");
        System.out.println("[3] Close Converter");
        System.out.print("User Input: ");
        int userChoice = scanOne.nextInt();

        return userChoice;

    }

}