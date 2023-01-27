public class Time {
    private int hour;
    private int minute;
    private double second;

    /* Contructor without parameters */
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    /* Constructor with parameter elements */
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /* Method that shows Time object's attributes */
    public void showTime() {
        System.out.println(this.hour + " : " + this.minute + " : " + this.second);
    }

    /* Method that adds a Time object attributes to another object attributes */
    /*
     * Exercise 11.1 The implementation of increment in this chapter is not very
     * efficient. Can you rewrite it so it doesn’t use any loops?
     * Hint: Remember the remainder operator—it works with floating-point too.
     */
    public Time addTime(Time paraTime) {
        Time sumTime = new Time();
        sumTime.hour = this.hour + paraTime.hour;
        sumTime.minute = this.minute + paraTime.minute;
        sumTime.second = this.second + paraTime.second;

        if (sumTime.second % 60 != 0) {
            sumTime.minute = (int) (sumTime.minute + sumTime.second / 60);
            sumTime.second = sumTime.second % 60;
        }
        if (sumTime.minute % 60 != 0) {
            sumTime.hour = sumTime.hour + sumTime.minute / 60;
            sumTime.minute = sumTime.minute % 60;
        }
        if (sumTime.hour > 12) {
            sumTime.hour -= 12;
        }
        return sumTime;
    }
}
