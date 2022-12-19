public class StringFormatting {

    public static void main(String[] args) {

        // System.out.println(timeString(15, 30));

        for (int i = 0; i <= 12; i++) { // iterating through hours in a day

            for (int j = 0; j < 60; j++) {

                System.out.println(timeString(i, j));

            }

        }

    }

    public static String timeString(int inHour, int inMin) {

        String timeFormat; // where we sill store all of our information

        if (inHour < 12) { // checks if hour is less than 12, if true, then it is morning

            timeFormat = "A.M.";

            if (inHour == 0) { // checks if hour is 0, if yes, reassign inHour to 12

                inHour = 12;

            }

        }

        else { // when hour is 12 or greater, set time to P.M.

            timeFormat = "P.M.";
            inHour -= 12; // inHour = inHour - 12;

        }

        return String.format("%02d:%02d %s", inHour, inMin, timeFormat);

    }

}
