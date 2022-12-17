import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {

        System.out.println("[Collatz Conjecture]");

        Scanner scanOne = new Scanner(System.in);

        System.out.print("Input number: ");
        int userNum = scanOne.nextInt();

        while (userNum != 1) {

            System.out.println(userNum);

            if (userNum % 2 == 0) { // checks if the number is an odd number

                userNum = userNum / 2; // divides number by 2

            }

            else if (userNum % 2 != 0) { // checks if the number is an even number

                userNum = 3 * userNum + 1;

            }

        }

        scanOne.close(); // closes Scanner

    }

}