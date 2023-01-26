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
    public void ShowTime() {
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

}
