public class Test {

    public static void main(String[] args) {
        
        Card twoOfClubs = new Card(0, 2);
        System.out.println(twoOfClubs.toString());
        Card aceOfHearts = new Card(2, 1);
        System.out.println(aceOfHearts.toString());
        System.out.println(twoOfClubs.compareTo(aceOfHearts));

        // DONE: Debug Card class
    }
    
}
