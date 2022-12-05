import java.util.Arrays;

public class CalcMethods {

    // Class that will contain methods that do certain calculations
    // - Average
    // - Median

    public float numAverage(float... floatArr) { // Method to find the average of inserted numbers

        float averageNum = 0;

        for (float eachFloat : floatArr) {

            averageNum = averageNum + eachFloat;

        }

        averageNum = averageNum / floatArr.length; // divides the sum of all numbers by how many arguments inserted
        return averageNum; // returns the average

    }

    public float numMedian(float... floatArr) {

        float medianNum = 0;

        // Sorting the array in ascending order
        Arrays.sort(floatArr);

        if (floatArr.length % 2 == 0) { // checks if the array length is an even number,
            // will return average of the two numbers and set that as the median

            float numMedianOne = floatArr[(floatArr.length / 2) - 1];
            float numMedianTwo = floatArr[(floatArr.length / 2)];

            medianNum = (numMedianOne + numMedianTwo) / 2;

        }

        else if (floatArr.length % 2 != 0) { // if array length is an odd number

            medianNum = floatArr[(floatArr.length + 1) / 2 - 1]; // finds the element that is in the middle of the array

        }

        return medianNum;

    }

}
