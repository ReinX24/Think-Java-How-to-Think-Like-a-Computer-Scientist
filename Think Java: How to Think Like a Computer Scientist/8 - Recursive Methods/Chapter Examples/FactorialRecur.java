public class FactorialRecur {

    public static void main(String[] args) {
        int factOne = factorialNum(5); // factorial of 5
        System.out.println(factOne);
    }

    public static int factorialNum(int paraNum) {
        if (paraNum == 0) {
            return 1;
        } else {
            int recurResult = paraNum * factorialNum(paraNum - 1);
            return recurResult;
        }

    }

}
