import java.util.ArrayList;

public class BetterPlayer extends Player {

    // /* Constructor for BetterPlayer class */
    // public BetterPlayer(String labelStr) {
    // super(labelStr);
    // }

    // /* Better version of the play() method */
    // public Card playGame(Eights eights, Card topCard) {
    // /* Store the most recent Card discarded, topCard */
    // Card targetCard = null;
    // do {
    // targetCard = searchForMatch(topCard);
    // /* if the Player does not have a Card similar to topCard */
    // if (targetCard != null) {
    // /* Add the matching Cards to an Array List */
    // ArrayList<Card> matchingCards = new ArrayList<>();
    // matchingCards.add(targetCard);
    // } else if (targetCard == null) {
    // /* Keep drawing from Deck in eights class until a similar Card is found */
    // targetCard = drawForMatch(eights, topCard);
    // }
    // } while (targetCard == null);
    // /* Return the current Card in target Card after finding a match */
    // return targetCard;
    // }

    public BetterPlayer(String name) {
        super(name);
    }

    /**
     * Evaluate value of certain card under certain condition
     */
    private static int eval(Card card, int total, boolean vary) {
        return eval(card.getRank(), total, vary);
    }

    /**
     * Evaluate value of certain card under certain condition
     */
    private static int eval(int rank, int total, boolean vary) {
        if (rank > 10) {
            return 10;
        }
        if (rank == 8) {
            if (total < 5 && !vary) {
                return 12;
            }
            return 0;
        }
        return rank;
    }

    /**
     * Searches the player's hand for the best matching card.
     */
    public Card searchForMatch(Card prev) {
        int[] suitStat = new int[4];
        int[] rankStat = new int[14];
        int index = -1;
        CardCollection pile = getHand();
        ArrayList<Integer> possible = new ArrayList<Integer>();
        for (int i = 0; i < pile.size(); i++) {
            Card card = pile.getCard(i);
            int suit = card.getSuitNum();
            int rank = card.getRank();
            suitStat[suit] += 1;
            rankStat[rank] += 1;
            if (cardMatches(card, prev)) {
                possible.add(i);
                if (possible.size() == 1) {
                    index = i;
                }
            }
        }
        int total = possible.size();
        if (total == 0) {
            return null;
        }
        if (total > 1) {
            // Evalute cards
            int max = -1;
            boolean vary = true;
            for (int i = 0; i < 4; i++) {
                if (suitStat[i] == 0) {
                    vary = false;
                    break;
                }
            }
            for (int i = 0; i < total; i++) {
                int position = possible.get(i);
                EightsCard card = pile.getCard(position);
                int rank = card.getRank();
                int suit = card.getSuit();
                int val = eval(rank, total, vary);
                // With different weight
                int value = val * 3 + suitStat[suit] * 6 + rankStat[rank] * 5;
                if (value > max) {
                    index = position;
                    max = value;
                }
            }
        }
        return pile.removeAt(index);
    }

}
