public class TimeMain {

    public static void main(String[] args) {

        Time timeOne = new Time(11, 30, 45); // creates a new time object from the Time class
        timeOne.ShowTime(); // shows attributes of timeOne
        /* Changing the attributes of timeOne using setters */
        timeOne.setHour(5);
        timeOne.setMinute(20);
        timeOne.setSecond(5.5);
        timeOne.ShowTime();
        /* Printing timeOne attributes using getters */
        System.out.println(timeOne.getHour());
        System.out.println(timeOne.getMinute());
        System.out.println(timeOne.getSecond());
        /* Using our toString method to print the time */
        System.out.println(timeOne.toString());

    }

}