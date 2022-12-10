import java.util.Arrays;
import java.util.LinkedHashSet;

public class ModeArray {

    public static void main(String[] args) {

        // Find the mode or most frequent number in the array

        int[] numArr = { 2, 1, 5, 6, 1, 3, 5, 1, 6, 2, 5 }; // mode should be 1
        LinkedHashSet<Integer> modeList = new LinkedHashSet<Integer>(); // array list that will hold modes
        Arrays.sort(numArr); // sorts the array from lowest to highest

        int maxNumber = 0;
        int maxAppearances = 0;

        for (int i = 0; i < numArr.length; i++) { // iterates through array

            int myCount = 0; // counter for appearances

            for (int j = 0; j < numArr.length; j++) { // another loop that iterates through array

                if (numArr[i] == numArr[j]) { // if current number is equal to another number in the array,

                    ++myCount; // then increment by one

                }

            }

            if (myCount > maxAppearances) { // checks if current count is larger than the last count

                maxNumber = numArr[i]; // maxNumber becomes the most frequent number
                maxAppearances = myCount; // new record for maxApperances set
                modeList.removeAll(modeList); // removes all elements
                modeList.add(maxNumber); // adds new most frequent number

            }

            else if (myCount == maxAppearances) { // if current count is equal to last count, add to mode list

                maxNumber = numArr[i]; // maxNumber becomes the most frequent number
                maxAppearances = myCount; // new record for maxApperances set
                modeList.add(maxNumber); // adds element to other elements

            }

        }

        System.out.println(modeList);

    }

}
