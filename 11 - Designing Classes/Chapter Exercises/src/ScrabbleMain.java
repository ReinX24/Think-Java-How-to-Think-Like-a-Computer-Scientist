public class ScrabbleMain {

    public static void main(String[] args) {

        /*
         * Exercise 11.2 In the board game Scrabble, each tile contains a letter, which
         * is used to spell words in rows and columns, and a score, which is used to
         * determine the value of words. The point of this exercise is to practice the
         * mechanical part of creating a new class definition:
         */

        /*
         * 4. Write a main method that creates a Tile object with the letter Z and
         * the value 10, and then uses printTile to display the state of the object.
         */
        Tile tileOne = new Tile('Z', 10);
        Tile tileTwo = new Tile('Z', 10);
        Tile tileThree = new Tile('Y', 9);
        Tile.printTile(tileOne); // prints Tile attributes using a method's parameters
        System.out.println(tileOne.toString()); // using our toString method
        System.out.println(tileOne.equals(tileTwo)); // using our equals method, true
        System.out.println(tileOne.equals(tileThree)); // false

        Tile.printTile(tileOne);
        Tile.printTile(tileThree);
        System.out.println(tileOne.getTileChar()); // Z
        System.out.println(tileThree.getTileValue()); // 9
        tileOne.setTileChar('X');
        tileThree.setTileValue(5);
        Tile.printTile(tileOne); // X 10
        Tile.printTile(tileThree); // Y 5

    }

}
