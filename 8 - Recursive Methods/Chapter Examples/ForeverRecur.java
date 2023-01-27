public class ForeverRecur {

    public static void main(String[] args) {
        foreverPrint("Hello!");
    }

    public static void foreverPrint(String myStr) {
        System.out.println(myStr);
        foreverPrint(myStr); // prints String until an exception occurs
    }
    
}
