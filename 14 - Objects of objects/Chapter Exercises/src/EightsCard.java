public class EightsCard extends Card {

    /*
     * Exercise 14.4 When we designed the program for this chapter, we tried to
     * minimize the number of classes. As a result, we ended up with a few awkward
     * methods. For example, cardMatches is a static method in Player, but it
     * would be more natural if it were an instance method in Card.
     * 
     * The problem is that Card is supposed to be useful for any card game, not just
     * Crazy Eights. You can solve this problem by adding a new class, EightsCard,
     * that extends Card and provides a method, match, that checks whether two
     * cards match according to the rules of Crazy Eights.
     */
    /* Constructor for EigthsCard */
    public EightsCard(int rankNum, int suitNum) {
        super(rankNum, suitNum);
    }

    /* cardMatches method, but it is an instance method instead of a static one */
    public boolean cardMatches(Card comparedCard) {
        if (getRank() == comparedCard.getRank()) {
            return true;
        }
        if (getSuit() == comparedCard.getSuit()) {
            return true;
        }
        if (getRank() == 8) {
            return true;
        }
        return false;
    }

}
