public class TimeMain {

    public static void main(String[] args) {
        
        Time timeOne = new Time(10, 30, 30.5);
        Time timeTwo = new Time(2,30, 120.5);
        Time timeSum = timeOne.addTime(timeTwo);
        timeSum.showTime();

    }
    
}
