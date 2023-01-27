public class MainClass {

    public static void main(String[] args) {

        // Creating an object to access methods in CalcMethods class
        CalcMethods averageObj = new CalcMethods();

        // Find the average of 4 numbers using the numAverage method
        float aveNumOne = averageObj.numAverage(12, 15, 14, 18);
        System.out.printf("Average (4 numbers): %.2f\n", aveNumOne); // rounds off to the nearest hundredths

        // Find the average of 5 numbers
        float aveNumTwo = averageObj.numAverage(14, 16, 98, 45, 29);
        System.out.printf("Average (5 numbers): %.2f\n", aveNumTwo);

        // Finding the median of 4 numbers
        CalcMethods medianObj = new CalcMethods();
        float medianNumOne = medianObj.numMedian(14, 12, 60, 16);
        System.out.println("Median (4 numbers): " + medianNumOne);

        // Finding the median of 5 numbers
        float medianNumTwo = medianObj.numMedian(14, 65, 81, 42, 40);
        System.out.println("Median (5 numbers): " + medianNumTwo);

        // 6 numbers
        float medianNumThree = medianObj.numMedian(12, 45, 67, 23, 78, 20); 
        // 14, 20, 23, 45, 67, 78 
        // 23 + 45 = 68 / 2 = 34
        System.out.println("Median (6 numbers): " + medianNumThree);

        // 7 numbers
        float medianNumFour = medianObj.numMedian(14, 65, 23, 87, 56, 94, 18);
        // 14, 18, 23, 56, 65, 87, 94
        // 56
        System.out.println("Median (7 numbers): " + medianNumFour);

    }
    
}