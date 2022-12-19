public class TimeFunction {

    public static void main(String[] args) {

        /*
         * NOT PART OF CHAPTER EXERCISE, PERSONAL EXERCISE
         * See page 102
         * 
         */

        // Make a for loop that shows the time from 7 A.M. to 12 P.M.

        // for (int i = 7; i <= 23; i++) { // times starts at 7 A.M.

        // for (int j = 0; j < 60; j++) { // for looping minutes, when this loop breaks
        // the outer loop breaks as well

        // System.out.println(timeFormat(i, j)); // starts at 7 A.M. & stops before 12
        // A.M.

        // }

        // }

        // Make a for loop that shows the time from 12 A.M. to 12 P.M.

        for (int i = 0; i < 24; i++) {

            for (int j = 0; j < 60; j++) {

                System.out.println(timeFormat(i, j));

            }

        }

    }

    public static String timeFormat(int myHour, int myMin) {

        String timeStat; // string that will store A.M. or P.M.

        if (myHour < 12) {

            timeStat = "A.M.";

            // If it is 0 but we want to show 12 instead of 00

            if (myHour == 0) {

                myHour = 12; // set hour to 12, this will translate time to 12 A.M.

            }

        }

        else { // if myHour is over 12

            timeStat = "P.M.";

            if (myHour == 12) {

                // Shows 12 P.M., does not affect time format

            }

            else {

                myHour -= 12; // minus 12 in myHours, this will turn something like 13 to 1 P.M.

            }

        }

        return String.format("%02d : %02d %s", myHour, myMin, timeStat);
        // %02d means it stores 2 spaces for a decimal, %s means it stores a String

    }

}