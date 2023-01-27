public class NullException {

    public static void main(String[] args) {

        String myStr = null;
        int[] numArr = null;
        // Invoking a method through a null Object
        System.out.println(myStr.length()); // NullPointerException
        // Accessing an element in a null Array
        System.out.println(numArr[0]); // NullPointerException

    }

}