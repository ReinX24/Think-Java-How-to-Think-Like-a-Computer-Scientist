public class Player {

    int playerHealth = 0;
    int playerMoney = 0;
    String playerName = " ";
    int playerElo = 0;

    Player() { // constructor for when a Player object is made, not run when another
               // constructor is used

        this.playerHealth = 100;
        this.playerMoney = 800;

    }

    Player(String playerName, int playerElo) { // when parameters are entered

        this.playerName = playerName; // reassigns the one in the class with the one in the parameters
        this.playerElo = playerElo;
        // needs to repeat assigning of values since the first constructor is not
        // invoked when another constructor is used
        this.playerMoney = 800;
        this.playerHealth = 100;

    }

    Player(Player copyPlayer) {

        this.playerName = copyPlayer.playerName; // copies name of inserted player
        this.playerElo = copyPlayer.playerElo; // copies elo
        this.playerHealth = copyPlayer.playerHealth; // health
        this.playerMoney = copyPlayer.playerMoney; // money

    }

    public void showDetails() {

        System.out.println("Name: " + playerName); // attributes that will show will depend on each object
        System.out.println("Player Elo: " + playerElo);
        System.out.println("Health: " + playerHealth);
        System.out.println("Money: " + playerMoney);

    }

}
