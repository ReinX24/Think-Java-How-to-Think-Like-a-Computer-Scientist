public class CodingBatArrays {

    public static void main(String[] args) {

        /*
         * Recursion-1 array11
         * Given an array of ints, compute recursively the number of times
         * that the value 11 appears in the array.
         * array11([1, 2, 11], 0) → 1
         * array11([11, 11], 0) → 2
         * array11([1, 2, 3, 4], 0) → 0
         */

        int[] arrOne = { 1, 2, 11 };
        System.out.println(repeatingNum(arrOne, 0)); // just 1 instance of 11

        /*
         * Explanation:
         * It repeats the repeatingNum function inside until the function until the
         * index reaches the last element of the program. When this happens, a 0 is
         * returned and the function before that evaluates if the current iterated
         * number is equal to 11. numArr[2] is equal to 11 so it adds 1 to the
         * returned 0 from the last call of repeatingNum. numArr[1] is not 11 so
         * we return recurNum without adding 1. numArr[0] is not 11 so it just returns
         * recurNum, which is 1. This means that the array has only one instance of 11.
         */

    }

    public static int repeatingNum(int[] numArr, int numIndex) { // method for finding repeating elements in an array
        if (numIndex >= numArr.length) { // if numIndex is greater than or equal than array length
            return 0;
        }
        int recurNum = repeatingNum(numArr, numIndex + 1);
        if (numArr[numIndex] == 11) {
            return recurNum + 1;
        } else {
            return recurNum;
        }
    }

}
