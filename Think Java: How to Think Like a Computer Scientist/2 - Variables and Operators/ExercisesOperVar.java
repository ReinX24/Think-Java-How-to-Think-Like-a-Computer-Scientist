import java.util.Scanner;

public class ExercisesOperVar {
    public static void main(String[] args) {

        // Exercise 2.2

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

        System.out.println("[American format: " + myDay + ", " + myMonth + " " + myDate + ", " + myYear + "]");
        System.out.println("[European format: " + myDay + " " + myDate + " " + myMonth + " " + myYear + "]");

        scanOne.close();

    }

}
