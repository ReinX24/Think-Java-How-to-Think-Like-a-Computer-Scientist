import java.util.ArrayList;

public class BetterPlayer extends Player {

    /*
     * Exercise 14.1 Design a better strategy for the Player.play method. For
     * example, if there are multiple cards you can play, and one of them is an
     * eight, you might want to play the eight. Think of other ways you can minimize
     * penalty points, such as playing the highest ranking cards first. Write a new
     * class that extends Player and overrides play to implement your strategy.
     */

    /* Contructor for BetterPlayer class */
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
    public Card searchForMatch(Card topCard) {
        int[] suitStat = new int[4];
        int[] rankStat = new int[14];
        int indexNum = -1;

        /* Put Player hand in a CardCollection object */
        CardCollection playerCards = getHand();

        /* Create an ArrayList that stores all possible matches */
        ArrayList<Integer> possibleCardMatches = new ArrayList<Integer>();

        /* Loop through the player's Card objects */
        for (int i = 0; i < playerCards.size(); i++) {

            /* Get currentCard, suitNum, & rankNum */
            Card currentCard = playerCards.getCard(i);
            int suitNum = currentCard.getSuitNum();
            int rankNum = currentCard.getRank();

            /* Increment the indexes of suitStat & rankStat */
            suitStat[suitNum] += 1;
            rankStat[rankNum] += 1;

            /* If the currentCard matches topCard (most recent discarded Card) */
            if (cardMatches(currentCard, topCard)) {
                /* Add the Card to possibleMatches ArrayList */
                possibleCardMatches.add(i);
                /* If there is 1 element in possibleCardMatches, make index into i */
                if (possibleCardMatches.size() == 1) {
                    indexNum = i;
                }
            }
        }

        /* After looping, return the best possible Card */
        /* Store the number of elements in possibleCardMatches in totalSize */
        int totalSize = possibleCardMatches.size();
        /* If totalSize == 0, return null, prompts drawForMatch (check Player class) */
        if (totalSize == 0) {
            return null;
        }
        /* If the totalSize is > 1, evaluate the Cards */
        if (totalSize > 1) {
            // Evalute cards
            int max = -1;
            boolean vary = true;
            /* Loops through suitStat */
            for (int i = 0; i < 4; i++) {
                /* If one of the suitStat indexes are 0, make vary false and break loop */
                if (suitStat[i] == 0) {
                    vary = false;
                    break;
                }
            }
            /* Looping through possibleCardMatches ArrayList */
            for (int i = 0; i < totalSize; i++) {
                /* Store the element within cardPosition */
                int cardPosition = possibleCardMatches.get(i);
                /* Store the the current iterated Card in currentCard */
                Card currentCard = playerCards.getCard(cardPosition);
                /* Get the corresponding rankNum & suitNum */
                int rankNum = currentCard.getRank();
                int suitNum = currentCard.getSuitNum();
                /* Stores the val method results in val */
                int val = eval(currentCard, totalSize, vary);
                /* Use a formula that computes for the value of the Card */
                int cardValue = val * 3 + suitStat[suitNum] * 6 + rankStat[rankNum] * 5;
                /* If the cardValue of the currentCard is higher than max */
                if (cardValue > max) {
                    /* Replace the index with the cardPosition */
                    indexNum = cardPosition;
                    /* Replace max with current cardValue */
                    max = cardValue;
                }
            }
        }
        /* Remove the highest matching Card value in the Array */
        return playerCards.popCard(indexNum);
    }

}
