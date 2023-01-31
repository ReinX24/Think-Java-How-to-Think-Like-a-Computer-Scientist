public class CardMain {

    public static void main(String[] args) {
        
        System.out.println("Arrays of Objects Exercises");
        
        Card aceOfClubs = new Card(0, 1); 
        System.out.println(aceOfClubs.toString()); // Ace of Clubs
        Card equalsTest = new Card(0, 1);
        System.out.println(aceOfClubs.equals(equalsTest)); // true

        /* Testing compareTo method */
        Card twoOfClubs = new Card(0, 2);
        System.out.println(aceOfClubs.comapreTo(twoOfClubs)); // returns -1
        Card twoOfDiamonds = new Card(1, 2);
        System.out.println(twoOfDiamonds.comapreTo(aceOfClubs)); // 1

        /* Creating a card array with cards */
        Card[] cardArr = new Card[52]; // contains 52 cards

        int indexNum = 0;
        for (int suitNum = 0; suitNum <= 3; suitNum++) {
            for (int rankNum = 1; rankNum <= 13; rankNum++) {
                cardArr[indexNum] = new Card(suitNum, rankNum);
                indexNum++;
            }
        }

        /* Printing the array using a method */
        printDeck(cardArr);

    }

    public static void printDeck(Card[] cardArr) {
        for (int i = 0; i < cardArr.length; i++) {
            System.out.println(cardArr[i].toString());
        }
    }

}