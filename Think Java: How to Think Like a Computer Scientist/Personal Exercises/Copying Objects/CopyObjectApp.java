class CopyObjectApp {

    public static void main(String[] args) {

        Player playerOne = new Player("ReinX24", 534); // create a Player object

        System.out.println();
        System.out.println("Player 1:");
        playerOne.showDetails(); // has all the details

        Player playerTwo = new Player();

        System.out.println();
        System.out.println("Player 2:");
        playerTwo.showDetails(); // only has health and money set because of constructor

        Player playerThree = new Player("Rein25", 354);

        System.out.println();
        System.out.println("Player 3:");
        playerThree.showDetails();

        // What if we want to copy the attributes of object one to another object?
        // We do the following

        Player playerFour = new Player(playerOne); // insert playerOne object as parameter
        // inside the Player class, we have a constructor that copies all attributes of
        // a Player
        // object and applies them to the new object

        System.out.println();
        System.out.println("Player 4:");
        playerFour.showDetails(); // has the same details as playerOne

    }

}