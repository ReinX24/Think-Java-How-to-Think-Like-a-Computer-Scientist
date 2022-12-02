public class TimeConversion {

    public static void main(String[] args) {

        // 3600 sec for 1 hours
        // 1800 sec for 30 min

        // convertSecondsTime(5400);

        int timeStart = 5400;

        int timeUsed = 935; // 15 minutes and 35 seconds

        timePassed(timeStart, timeUsed);

        // Time remaining

        // int startTime = mySeconds;

    }

    // Function that converts seconds into minutes and hours
    public static void convertSecondsTime(int timeSec) {

        int mySeconds = timeSec;

        // We want to convert these seconds into minutes and seconds

        int convertMin = mySeconds / 60; // turns seconds into minutes
        int convertSec = mySeconds % 60; // remainder of convsersion

        // System.out.println("Seconds: " + convertSec);
        // System.out.println("Minutes: " + convertMin); // shows minutes above 60

        // Now we want to convert minutes into hours if possible

        int convertMinHour = convertMin % 60; // to show minutes when hours is taken into account

        // System.out.println("Minutes: " + convertMinHour);

        int convertHour = convertMin / 60; // converts minutes to hours

        // System.out.println("Hours: " + convertHour);

        System.out.println("Time : " + convertHour + ":" + convertMinHour + ":" + convertSec);

    }

    public static void timePassed(int timeSec, int timeUsed) {

        System.out.println("[Time Start]");
        convertSecondsTime(timeSec);

        System.out.println("[Time Used]");
        convertSecondsTime(timeUsed);

        System.out.println("[Time Remaining]");
        int timeRemaining = timeSec - timeUsed;
        convertSecondsTime(timeRemaining);


    }

}
