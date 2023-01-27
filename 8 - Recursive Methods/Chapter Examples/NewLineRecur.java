public class NewLineRecur {

    public static void main(String[] args) {
        
        newLine(5); // prints 5 lines

    }

    public static void newLine(int lineAmount) {
        if(lineAmount > 0){
            System.out.println("-----");
            newLine(lineAmount - 1);
        }
    }
    
}
