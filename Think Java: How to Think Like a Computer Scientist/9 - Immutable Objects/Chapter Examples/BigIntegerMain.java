import java.math.BigInteger;

public class BigIntegerMain {

    public static void main(String[] args) {
        
        // Converting long to BigInteger
        long longOne = 57;
        BigInteger bigIntOne = BigInteger.valueOf(longOne);
        System.out.println(bigIntOne);

        // Converting String to BigInteger
        String strOne = "12345678901234567890";
        BigInteger bigIntTwo = new BigInteger(strOne);
        System.out.println(bigIntTwo);

        // To add BigIntegers, we need to use methods rather than operators
        BigInteger bigIntThree = BigInteger.valueOf(34);
        BigInteger bigIntFour = BigInteger.valueOf(452340000);
        BigInteger bigIntSum = bigIntThree.add(bigIntFour);
        System.out.println(bigIntSum);


    }
    
}
