public class Hand extends CardCollection {

    /* Constructor for Hand objects */
    public Hand(String labelStr) {
        super(labelStr);
    }

    /* Displaying Hand objects */
    public void displayHand() {
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++) {
            System.out.println(getCard(i));
        }
        System.out.println();
    }
    
}
