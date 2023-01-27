public class SearchArrays {

    public static void main(String[] args) {

        /*
         * Creating a method that finds a certain element in an array
         * 
         */

        int[] numArr = { 1, 3, 5, 7, 9 };

        System.out.println(searchArr(numArr, 5)); // prints found message
        System.out.println(searchArr(numArr, 2)); // prints not found message

    }

    public static String searchArr(int[] numArr, int targetElem) {
        // numArr is our array whereas targetElem is the element we want to find

        String searchResult = ""; // where we will store our result
        int matchCounter = 0; // counts how many matches are there in the array

        for (int i = 0; i < numArr.length; i++) {

            if (targetElem == numArr[i]) {

                matchCounter++;

            }

            

        }

        if (matchCounter > 0) { // if the current element is the same with the targetElem

            searchResult = "Element found! : " + targetElem; // prints found message and the target number

        }

        else {

            searchResult = "Element not found! : " + targetElem; // prints if no similar elements are found

        }

        return searchResult;

    }

}