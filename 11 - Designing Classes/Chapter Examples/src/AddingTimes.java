public class AddingTimes {

    public static void main(String[] args) {

        Time startTime = new Time(18, 50, 0.0);
        Time runningTime = new Time(2, 16, 0.0);
        /* Adding 2 time objects together using a static method */
        Time endTime = Time.addTime(startTime, runningTime);
        startTime.showTime();
        runningTime.showTime();
        endTime.showTime(); // minutes is 66, should
        /* Adding attributes together using an instance method */
        Time endTimeInstance = startTime.addTimeInstance(runningTime); // minutes is 6 instead of 66, adds 1 to hour
        endTimeInstance.showTime(); // proper add time result

    }

}
