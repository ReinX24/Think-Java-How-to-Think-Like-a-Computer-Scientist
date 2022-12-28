public class FruitExercise {

    public static void main(String[] args) {

        int[] numArr = { 1, 3, 5, 7, 9 };
        System.out.println(bananaMethod(numArr));
        System.out.println(grapefruitMethod(numArr, 3));
        System.out.println(grapefruitMethod(numArr, 2));
        System.out.println(pineappleMethod(numArr, 5));

    }

    // Method that takes in a array parameter and multiplies all the numbers in that
    // array
    public static int bananaMethod(int[] arrNum) {

        int kiwiFruit = 1;
        int i = 0; // starting index of the while loop
        while (i < arrNum.length) { // while loop that iterates through the array

            kiwiFruit = kiwiFruit * arrNum[i]; // multiplies kiwiFruit with array element
            i++; // increments i

        }

        return kiwiFruit; // return kiwiFruit after while loop

    }

    // Method that accepts an array and an integer, finds if integer is part of the
    // array
    public static int grapefruitMethod(int[] numArr, int grapeNum) {

        for (int i = 0; i < numArr.length; i++) { // for loop that iterates through the array

            if (numArr[i] == grapeNum) { // checks if grapeNum is similar to the iterated element

                return i; // returns index

            }

        }

        return -1; // return -1 if there are no matches

    }

    // Method that takes in an array and an integer, if the integer is equal to an
    // element, increment pearFruit
    public static int pineappleMethod(int[] numArr, int appleNum) {

        int pearFruit = 0;
        for (int pineNum : numArr) { // for each loop that iterates through numArr

            if (pineNum == appleNum) { // if the current iterated element is the same with appleNum

                pearFruit++; // increments pearFruit if appleNum is inside the numArr

            }

        }

        return pearFruit; // returns pearFruit

    }

}