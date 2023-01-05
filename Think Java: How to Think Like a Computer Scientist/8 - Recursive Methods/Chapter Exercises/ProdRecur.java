public class ProdRecur {

    public static void main(String[] args) {

        /*
         * Exercise 8.3 In this exercise, you will use a stack diagram to understand
         * the execution of the following recursive method:
         * (Page 142)
         * 
         */
        System.out.println(prodMethod(1, 4)); // 4 * 3 * 2 * 1 = 24
    }

    public static int prodMethod(int numOne, int numTwo) {
        if (numOne == numTwo) { // base method
            return numTwo;
        } else {
            int recurNum = prodMethod(numOne, numTwo - 1);
            int numResult = numTwo * recurNum;
            return numResult;
        }
    }

}
