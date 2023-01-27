import java.util.Random;
import java.util.Scanner;

public class ExerciseApp {

    public static void main(String[] args) {

        // Guess My Number game

        /*
         * You should already have a program that chooses a random number, prompts
         * the user to guess it, and displays the difference between the guess and the
         * chosen number. (Done)
         * 
         * By adding a small amount of code at a time and testing as you go, modify the
         * program so it tells the user whether the guess is too high or too low, and
         * then prompts the user for another guess. (Done)
         * 
         * The program should continue until the user gets it right or guesses
         * incorrectly three times. If the user guesses the correct number, display a
         * message and terminate the program. (Done)
         * 
         */

        System.out.println("[Guess My Number Game]");

        int guessCount = 3; // number of guesses the user has
        Scanner sOne = new Scanner(System.in);

        while (guessCount > 0) { // while user still has guesses, loop code block below

            // Ask the user to input a number
            System.out.println("[Guesses Remaining: " + guessCount + "]");
            System.out.print("Input a number from 1 to 100: ");
            int userNum = sOne.nextInt();

            if (userNum > 0 && userNum <= 100) { // checks if userNum is between 1 and 100, including both numbers

                // Picks a random number between 1 and 100
                Random ranOne = new Random(); // Random object
                int ranNum = ranOne.nextInt(100) + 1; // results in a number between 1 and 100
                // ranOne.nextInt gives a number between 0 and 99 including both, we add one so
                // that this becomes 1 to 100 including both

                int numDiff = 0; // stores the difference of the two numbers

                if (userNum != ranNum) {
                    // checks if userNum is greater than ranNum, this is so that the difference will
                    // always be a positive integer

                    numDiff = Math.abs(userNum - ranNum); // returns the absolute value of the difference

                    System.out.println("**********************************");

                    if (userNum > ranNum) { // checks if your number is too high from the random number

                        System.out.println("Your number is too high!");

                    }

                    else { // if number is too low from the random number

                        System.out.println("Your number is too low!");

                    }

                    System.out.println("**********************************");
                    System.out.println("Your number: " + userNum);
                    System.out.println("Random number: " + ranNum);
                    System.out.println("You were off by " + numDiff);
                    System.out.println("**********************************");
                    guessCount = guessCount - 1;

                }

                else { // if the inputted number and the random number are identical

                    System.out.println("**********************************");
                    System.out.println("[You Guessed Correctly!]");
                    System.out.println("**********************************");
                    sOne.close(); // closes the Scanner
                    return; // terminates the program

                }

            }

            else { // if the inputte number is not between 1 to 100, including both

                System.out.println("[Out of Number Range]");

            }

        }

        System.out.println("[No More Guesses Remaining]");

        sOne.close(); // closes the Scanner

    }

}