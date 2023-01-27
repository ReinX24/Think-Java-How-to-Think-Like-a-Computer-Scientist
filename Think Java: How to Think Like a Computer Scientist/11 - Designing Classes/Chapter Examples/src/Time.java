public class Time {
    private int hour;
    private int minute;
    private double second;
    public String descTime = "Time Object";

    /* Constructor without parameters */
    public Time() {
        this.hour = 0; // this refers to attributes in this class
        this.minute = 0;
        this.second = 0;
    }

    /* Constructor for the time class with parameters */
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /* Method that shows the current attributes of the object */
    public void showTime() {
        System.out.printf("%3d : %3d : %4.1f\n", this.hour, this.minute, this.second);
        // d for integers, f for floating point numbers
    }

    /* Getters */
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public double getSecond() {
        return this.second;
    }

    /* Setters */
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    /* Creating our own toString method, overrides built-in toString method */
    public String toString() {
        return String.format("%3d : %3d : %4.1f", this.hour, this.minute, this.second);
    }

    /* Method that compares current object attributes to another object */
    public boolean equals(Time paraTime) {
        final double DELTA = 0.001;
        return this.hour == paraTime.hour && this.minute == paraTime.minute
                && Math.abs(this.second - paraTime.second) < DELTA;
        // Math.abs returns a positive double, if the difference is less than DELTA
        // (0.001), returns true
    }

    /*
     * Method that adds 2 time object attributes together and returns a time object.
     * Needs to be a static method since we are calling it directly without a Time
     * object.
     */
    public static Time addTime(Time timeOne, Time timeTwo) {
        Time sumTime = new Time(timeOne.hour + timeTwo.hour, timeOne.minute + timeTwo.minute,
                timeOne.second + timeTwo.second);
        return sumTime;
    }

    /*
     * Adds time but using an instance method (an object needs to be created to use
     * the method).
     */
    public Time addTimeInstance(Time paraTime) {
        Time sumTime = new Time();
        sumTime.hour = this.hour + paraTime.hour;
        sumTime.minute = this.minute + paraTime.minute;
        sumTime.second = this.second + paraTime.second;
        /* Adding if, else if, statements to fix Time attriibutes */
        if (sumTime.second >= 60) {
            sumTime.second -= 60;
            sumTime.minute += 1;
        } 
        if (sumTime.minute >= 60) {
            sumTime.minute -= 60;
            sumTime.hour += 1;
        }
        if (sumTime.hour >= 24) {
            sumTime.hour -= 24;
        }
        return sumTime;
    }

}
