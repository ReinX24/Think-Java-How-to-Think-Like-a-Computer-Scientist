import java.util.Scanner;

public class SimpleJavaCalculator {

    public static void main(String[] args) {

        double numOne = 0.0;
        double numTwo = 0.0;
        double myResult = 0.0;
        char myOperator;

        Scanner scanOne = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        numOne = scanOne.nextDouble();
        System.out.print("Enter 2nd number: ");
        numTwo = scanOne.nextDouble();
        System.out.print("Enter operator(+,-,x,/): ");
        myOperator = scanOne.next().charAt(0);

        switch (myOperator) {

            case '+':
                addNum(numOne, numTwo, myResult);
                break;
            case '-':
                subNum(numOne, numTwo, myResult);
                break;
            case 'x':
                mulNum(numOne, numTwo, myResult);
                break;
            case '/':
                divNum(numOne, numTwo, myResult);
                break;
            default:
                System.out.println("Not a valid operator!");
                break;

        }

        scanOne.close(); // closes the scanner

    }

    // Creating methods for operations

    // Adding numbers
    private static void addNum(double numOne, double numTwo, double myResult) {
        // Static means it is shared between all made objects

        myResult = numOne + numTwo;
        System.out.println("Sum of the two numbers: " + myResult);

    }

    // Subtracting numbers
    private static void subNum(double numOne, double numTwo, double myResult) {

        myResult = numOne - numTwo;
        System.out.println("Difference of the two numbers: " + myResult);

    }

    // Multiplying numbers
    private static void mulNum(double numOne, double numTwo, double myResult) {

        myResult = numOne * numTwo;
        System.out.println("Product of the two numbers: " + myResult);

    }

    // Dividing numbers
    private static void divNum(double numOne, double numTwo, double myResult) {

        myResult = numOne / numTwo;
        System.out.println("Quotient of the two numbers: " + myResult);

    }

}
