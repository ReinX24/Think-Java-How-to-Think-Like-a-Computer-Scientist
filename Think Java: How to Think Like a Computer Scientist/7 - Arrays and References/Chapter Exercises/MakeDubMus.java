import java.util.Arrays;

public class MakeDubMus {

    public static void main(String[] args) {

        // Exercise 7.2

        int[] bob = make(5); // calls make method, returns an array

        System.out.println(Arrays.toString(bob));

        dub(bob); // bob method, modifies array even if it does not return anything

        System.out.println(Arrays.toString(bob)); // array modified by dub method

        System.out.println(mus(bob)); // mus method

        // Results guess:
        // make method
        // 1, 2, 3, 4, 5

        // dub method
        // 2, 4, 6, 8, 10
        
        // mus method
        // 30


    }

    // Make method
    public static int[] make(int n) { // returns an array

        int[] a = new int[n]; // creates a new array with the size of n
        for (int i = 0; i < n; i++) { // iterates through the array
            a[i] = i + 1; // adds numbers to array from 1 to array length
        }
        return a; // return the array
    }

    // Dub method
    public static void dub(int[] jub) { // takes in an array as a parameter

        for (int i = 0; i < jub.length; i++) { // iterates through the parameter array
            jub[i] *= 2; // multiplies each number inside the array by two
        }

    }

    // Mus method
    public static int mus(int[] zoo) { // returns an integer and takes an array parameter

        int fus = 0; // for holding all the sum of all the numbers
        for (int i = 0; i < zoo.length; i++) { // iterates through the array
            fus += zoo[i]; // adds each number to fus
        }
        return fus; // returns the number
    }

}
