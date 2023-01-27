public class VarArgClass {

    // Method that support variable-length arguements, it takes several arguments
    // and counts their length

    public int sumNum(int... vararg) { // vararg will store how many arguments you have passed in, like an array

        // Shows the amount of arguments passed in
        System.out.println("Variables passed in: " + vararg.length);

        // variable that will hold our total
        int numTotal = 0;

        // Loop that will add all of the numbers
        for (int eachNum : vararg) {

            numTotal = numTotal + eachNum;

        }

        // Return the sum of all the numbers
        return numTotal;

    }

}
