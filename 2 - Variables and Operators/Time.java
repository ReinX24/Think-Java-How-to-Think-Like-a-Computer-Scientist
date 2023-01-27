import java.nio.file.SecureDirectoryStream;

public class Time {

    public static void main(String[] args) {

        float myHour = 11;
        float myMinute = 10;
        float mySecond = 39;

        // Number of seconds since midnight

        float hourSec = myHour * 60 * 60; // converting hours to seconds
        float minSec = myMinute * 60;
        float secSinceMidnight = hourSec + minSec + mySecond;
        System.out.println("Seconds since midnight: " + secSinceMidnight);

        // Number of seconds remaining in the day

        float daySec = 24 * 60 * 60; // seconds for the entire day
        float secRemain = daySec + secSinceMidnight;
        System.out.println("Number of seconds remaining in the day: " + secRemain);

        // Percentage of the day passed

        float percentDayPassed = secSinceMidnight / daySec * 100;
        System.out.println("Percentage of the day passed: " + percentDayPassed);

        // Elapsed time

        float curHour = 12;
        float curMin = 1;
        float curSec = 30;

        float curTimeSec = (curHour * 60 * 60) + (curMin * 60) + curSec;
        float secondsElapsedProject = curTimeSec - secSinceMidnight;
        System.out.println("Time elapsed since the start of the project: " + secondsElapsedProject);

    }

}
