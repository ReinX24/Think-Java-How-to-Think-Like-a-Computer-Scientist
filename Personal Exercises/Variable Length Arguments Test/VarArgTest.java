class VarArgTest {

    public static void main(String[] args) {

        // Creating an object to access the methods
        VarArgClass sumObj = new VarArgClass();

        int firstSum = sumObj.sumNum(4, 5);
        // will use the method that prints the arguments passed in and return the sum of
        // the numbers in the parameters

        System.out.println("Sum of 4 and 5: " + firstSum); // prints the sum of the numbers

        int secondSum = sumObj.sumNum(12, 18, 32);
        System.out.println("Sum of 12, 18, and 32: " + secondSum);

        int numOne = 45;
        int numTwo = 38;
        int numThree = 91;
        int numFour = 74;

        int thirdNum = sumObj.sumNum(numOne, numTwo, numThree, numFour);
        System.out.println("Sum of numOne, numTwo, numThree, and numFour: " + thirdNum);

    }

}