import java.util.Scanner;

class TimeMethods {

    public static void main(String[] args) {

        // Exercise 4.1

        Scanner scanOne = new Scanner(System.in);

        String myDay = null;
        int myDate = 0;
        String myMonth = null;
        int myYear = 0;

        System.out.print("Enter day(Monday, Tuesday, etc.): ");
        myDay = scanOne.nextLine();

        System.out.print("Enter day of the month(15, 17, etc): ");
        myDate = scanOne.nextInt();
        scanOne.nextLine(); // fixes this runtime issue

        System.out.print("Enter month(January, March, etc.): ");
        myMonth = scanOne.nextLine();

        System.out.print("Enter year(2003, 2022, etc.): ");
        myYear = scanOne.nextInt();

        // Instead of printing them using a println, we will be using methods

        printAmerican(myDay, myDate, myMonth, myYear); // prints time format using methods
        printEuropean(myDay, myDate, myMonth, myYear);

        scanOne.close();

    }

    // Method that prints the American Format
    public static void printAmerican(String myDay, int myDate, String myMonth, int myYear) {

        System.out.println("[American format: " + myDay + ", " + myMonth + " " + myDate + ", " + myYear + "]");

    }

    // Method that prints the European Format
    public static void printEuropean(String myDay, int myDate, String myMonth, int myYear) {

        System.out.println("[European format: " + myDay + " " + myDate + " " + myMonth + " " + myYear + "]");

    }

}