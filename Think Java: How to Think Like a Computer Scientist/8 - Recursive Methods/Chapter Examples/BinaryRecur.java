public class BinaryRecur {

    public static void main(String[] args) {
        binaryConverter(5);
        /*
         * Explanation:
         * Our number is 5, since it is greater than 0, we divide it by 2 where we get
         * 2. We divide 2 again and then we get 1. 1 divided by 2 yields zero at this
         * point so the recursive function stops calling itself. We start from the last
         * paraNum which is 1, 1 % 2 = 1, 2 % 2 = 0, 5 % 2 = 1. Our result is 1 0 1, the
         * binary numbers of 5.
         */
        binaryConverter(23);
    }

    public static void binaryConverter(int paraVal) {
        if (paraVal > 0) {
            binaryConverter(paraVal / 2); // gets half of the number in parameter
            System.out.println(paraVal % 2); // finds of the number has a remainder
        }
    }

}
