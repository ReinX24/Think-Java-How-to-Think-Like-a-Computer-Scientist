public class Test {

    public static void main(String[] args) {
        // DONE: Loop the game to run at least 3 times
        /*
         * Exercise 14.2 Write a loop that plays the game 100 times and keeps track
         * of how many times each player wins. If you implemented multiple strategies in
         * the previous exercise, you can play them against each other to evaluate which
         * one works best.
         * 
         * Hint: Design a Genius class that extends Player and overrides the play
         * method, and then replace one of the players with a Genius object.
         */
        /* Counter for rounds */
        int roundCounter = 1;
        /* StringBuilder object to keep track of round winners */
        StringBuilder roundWinners = new StringBuilder();
        /* Create an Eights object */
        Eights gameTest;
        /* Instead of looping 100 times, I decided to do just 3 */
        while (roundCounter <= 3) {
            /* Finish an Eights object to start the game */
            gameTest = new Eights();
            /* Starting the game through a method in the Eights class */
            String gameWinner = gameTest.playGame(roundCounter);
            roundWinners.append(gameWinner);
            roundCounter++;
        }
        System.out.println(roundWinners);
    }

}
