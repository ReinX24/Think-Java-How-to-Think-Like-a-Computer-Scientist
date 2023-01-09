public class WrapperClasses {

    public static void main(String[] args) {

        int numOne = 7;
        // System.out.println(numOne.equals(7)); // compiler error
        Integer intOne = Integer.valueOf(numOne); // references numOne as an Integer Object
        System.out.println(intOne.equals(7)); // we can use methods on Objects

        Integer numX = Integer.valueOf(123);
        Integer numY = Integer.valueOf(123);

        if (numX == numY) { // == for primitive values or Objects
            System.out.println("X & Y are the same object"); // true since they are both Integers, only false for
                                                             // Strings
            // The book says this should return false, but it returns true and prints the
            // statement anyways
        }
        if (numX.equals(numY)) { // .equals since they are both Objects
            System.out.println("X & Y have the same value"); // true since both Objects are the same value
        }

        Integer MIN_VALUE = Integer.MIN_VALUE;
        Integer MAX_VALUE = Integer.MAX_VALUE;
        System.out.println("Integer min value: " + MIN_VALUE);
        System.out.println("Integer max value: " + MAX_VALUE);

        String numStr = "2468";
        int numStrConverted = Integer.parseInt(numStr); // converts String to integer
        System.out.println(numStr);
        System.out.println(numStrConverted);

        String strNum = "one";
        // int strNumConverted = Integer.parseInt(strNum); // cannot convert to int or primitive type
        System.out.println(strNum);
        // System.out.println(strNumConverted); // NumberFormatException

    }

}
