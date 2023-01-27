public class PowerRecur {

    public static void main(String[] args) {

        /*
         * Exercise 8.5 Write a recursive method called power that takes a double x
         * and an integer n and returns x n .
         * (Page 143)
         * 
         */

        System.out.println(powerNum(5, 2)); // 25
        System.out.println(powerNum(4, 2)); // 16
        System.out.println(powerNum(6, 3)); // 216
        System.out.println(powerNum(2, 4)); // 16

    }

    public static int powerNum(int baseInt, int powerInt) {
        int powerResult; // holding our result
        if (powerInt <= 0) { // base stack
            return 1; // return 1
        } else if (powerInt % 2 == 0) { // if powerInt is an even number, optional challenge in book
            powerResult = (int) Math.pow(powerNum(baseInt, powerInt /2), 2);
            return powerResult;
        } else {
            powerResult = powerNum(baseInt, powerInt - 1);
            return powerResult * baseInt;
        }
    }

}
