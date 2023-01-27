public class TimeMain {

    public static void main(String[] args) {

        Time timeOne = new Time(11, 30, 45); // creates a new time object from the Time class
        timeOne.showTime(); // shows attributes of timeOne
        /* Changing the attributes of timeOne using setters */
        timeOne.setHour(5);
        timeOne.setMinute(20);
        timeOne.setSecond(5.5);
        timeOne.showTime();
        /* Printing timeOne attributes using getters */
        System.out.println(timeOne.getHour());
        System.out.println(timeOne.getMinute());
        System.out.println(timeOne.getSecond());
        /* Using our toString method to print the time */
        System.out.println(timeOne.toString());

        Time timeTwo = timeOne; // refers to timeOne
        System.out.println(timeOne == timeTwo); // returns true since they are the same object

        Time timeThree = new Time(5, 20, 5.5);
        System.out.println(timeOne == timeThree); // returns false since while they may have the same attributes, they
                                                  // do not point at the same object

        System.out.println(timeOne.equals(timeTwo)); // returns true since same attributes
        System.out.println(timeOne.equals(timeThree)); // returns true also

        Time timeFour = new Time(7, 30, 10.5);
        System.out.println(timeOne.equals(timeFour)); // returns false since different attributes

    }

}