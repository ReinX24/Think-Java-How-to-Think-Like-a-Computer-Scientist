import java.util.Arrays;

public class MinNum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args)); // prints array of numbers
        if (args.length == 0) {
            System.err.println("Usage: java MinNum.java <numbers>");
            return; // terminates program
        }
        Integer minNum = Integer.MAX_VALUE;
        for (String eachArg : args) { // args are Strings by default
            int eachNum = Integer.parseInt(eachArg); // turns String to an integer
            if (eachNum < minNum) { // checks if current number is less than current minNum
                minNum = eachNum; // replaces minNum
            }
        }
        System.out.println("Min Number in Array is: " + minNum); // prints smallest number
    }

}
