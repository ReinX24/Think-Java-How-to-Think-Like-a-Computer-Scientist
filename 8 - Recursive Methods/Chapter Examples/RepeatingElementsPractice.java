public class RepeatingElementsPractice {

    public static void main(String[] args) {
        /*
         * Make 3 methods that find the numbers separately: 1, 5, and 10.
         * 
         */

        // Testing countOne method
        int[] arrOne = { 1, 3, 5, 7, 1, 1 };
        System.out.println("Amount of 1s: " + countOne(arrOne, 0));

        // Testing countOne method
        int[] arrTwo = { 2, 4, 5, 6, 8, 5 };
        System.out.println("Amount of 5s: " + countFive(arrTwo, 0));

        // Testing countTen method
        int[] arrThree = {1, 10, 2, 10, 3, 2, 6, 10, 10};
        System.out.println("Amount of 10s: " + countTen(arrThree, 0));
    }

    public static int countOne(int[] numArr, int numIndex) { // finding amounts of 1
        if (numIndex >= numArr.length) { // if at the final element in the array
            return 0;
        }
        int intCount = countOne(numArr, numIndex + 1); // goes to the next element in array
        if (numArr[numIndex] == 1) { // if the current iterated number is equal to 1
            return intCount + 1; // add 1 to number counter
        } else {
            return intCount; // return count number without adding
        }
    }

    public static int countFive(int[] numArr, int numIndex) {
        if (numIndex >= numArr.length) {
            return 0;
        }
        int intCount = countFive(numArr, numIndex + 1);
        if (numArr[numIndex] == 5) {
            return intCount + 1;
        } else {
            return intCount;
        }
    }

    public static int countTen(int[] numArr, int numIndex) {
        if (numIndex >= numArr.length) {
            return 0;
        }
        int intCount = countTen(numArr, numIndex + 1);
        if (numArr[numIndex] == 10) {
            return intCount + 1;
        } else {
            return intCount;
        }
    }

}
