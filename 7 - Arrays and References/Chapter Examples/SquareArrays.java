public class SquareArrays {

    public static void main(String[] args) {
        
        // Print the square of each element using a for loop

        int[] numArr = {1, 2, 3, 4, 5};

        // For loop that prints array
        System.out.print("{ ");
        for (int i = 0; i < numArr.length; i++) {

            if (numArr.length - 1 == i) { // if the loop is at the last element

                System.out.print(numArr[i]);

            }

            else {

            System.out.print(numArr[i] + ",");

            }

        }

        System.out.println(" }");

        for (int i = 0; i < numArr.length; i++) {

            numArr[i] *= numArr[i]; // multiplies by itself and replaces first number

        }

        // Printing array using a for loop

        System.out.print("{ ");
        for (int i = 0; i < numArr.length; i++) {

            if (numArr.length - 1 == i) { // if the loop is at the last element

                System.out.print(numArr[i]);

            }

            else {

            System.out.print(numArr[i] + ",");

            }

        }

        System.out.println(" }");

    }
    
}
