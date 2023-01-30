public class CardMain {

    public static void main(String[] args) {

        Card threeOfClubs = new Card(3, 0); // 3 of Clubs
        System.out.println(threeOfClubs.toString()); // using our own custom toString method to print attributes

        Card jackOfDiamonds = new Card(11, 1);
        System.out.println(jackOfDiamonds.toString()); // Jack of Diamonds

        Card queenOfHearts = new Card(12, 2);
        System.out.println(queenOfHearts.toString()); // Queen of Hearts

        /* Testing equals method */
        Card queenOfHeartsTest = new Card(12, 2); // another Queen of Hearts object to test equals method
        System.out.println(queenOfHearts.equals(queenOfHeartsTest)); // returns true
        System.out.println(queenOfHearts.equals(jackOfDiamonds)); // returns false

        /* Testing compareTo method */
        Card twoOfClubs = new Card(2, 0); // 2 of Clubs
        System.out.println(twoOfClubs.compareTo(threeOfClubs)); // returns -1 since twoOfClubs is less than threeOfClubs

        Card threeOfDiamonds = new Card(3, 1); // three of Diamonds
        System.out.println(threeOfDiamonds.compareTo(threeOfClubs)); // returns 1 threeOfDiamonds > threeOfClubs

        Card twoOfDiamonds = new Card(2, 1);
        System.out.println(twoOfDiamonds.compareTo(threeOfClubs));
        // returns 1 since twoOfDiamonds has a higher suit value than threeOfClubs
        System.out.println(threeOfDiamonds.compareTo(threeOfDiamonds)); // returns 0 since they have the same value

        /* Creating an Array of Cards */
        Card[] cardsArr = new Card[52]; 
    }

}
