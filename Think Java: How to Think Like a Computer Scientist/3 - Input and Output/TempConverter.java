import java.util.Scanner;

class TempConverter {

    public static void main(String[] args) {

        // Make a scanner input that will accept the values

        Scanner scanOne = new Scanner(System.in);

        // Instantiate the values

        // Choice to convert celcius to fahrenheit or vice versa

        System.out.println("[1] Celcius to Fahrenheit");
        System.out.println("[2] Fahrenheit to Celcius");
        System.out.print("User Input: ");
        int userChoice = scanOne.nextInt();

        if (userChoice == 1) {

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

            float celciusTemp = (fahrenheitTemp - 32) * 5/9;

            // Show the converted values

            System.out.printf("Fahrenheit: %.1f F\n", fahrenheitTemp); // tenths
            System.out.printf("Celcius: %.0f C\n", celciusTemp); // whole number

        }

        // Closing scanner
        scanOne.close();

    }

}