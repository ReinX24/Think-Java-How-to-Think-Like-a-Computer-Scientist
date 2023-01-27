public class Date {

    /*
     * Exercise 11.3 Write a class definition for Date, an object type that contains
     * three integers: year, month, and day. This class should provide two construc-
     * tors. The first should take no parameters and initialize a default date. The
     * second should take parameters named year, month and day, and use them to
     * initialize the instance variables.
     * Write a main method that creates a new Date object named birthday. The
     * new object should contain your birth date. You can use either constructor.
     */

    private int month;
    private int day;
    private int year;

    /* Constructor with no parameters */
    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 2000;
    }

    /* Constructor with parameters */
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /* Method that shows the date */
    public void showDate() {
        System.out.printf("%2d : %2d : %4d\n", this.month, this.day, this.year);
    }

}
