public class CardMain {

    public static void main(String[] args) {

        Card threeOfClubs = new Card(3, 0); // 3 of Clubs
        System.out.println(threeOfClubs.toString()); // using our own custom toString method to print attributes
    
        Card jackOfDiamonds = new Card(11, 1);
        System.out.println(jackOfDiamonds.toString()); // Jack of Diamonds

        Card queenOfHearts = new Card(12, 2);
        System.out.println(queenOfHearts.toString()); // Queen of Hearts

    }

}
