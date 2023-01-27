public class Tile {
    /*
     * 1. Write a definition for a class named Tile that represents Scrabble tiles.
     * The instance variables should include a character named letter and an
     * integer named value.
     */
    private char letter;
    private int value;

    /* Constructor with no parameter */
    public Tile() {
        this.letter = ' ';
        this.value = 0;
    }

    /*
     * 2. Write a constructor that takes parameters named letter and value,
     * and initializes the instance variables.
     */
    /* Parameter that sets letter and value */
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    /*
     * 3. Write a method named printTile that takes a Tile object as a param-
     * eter and displays the instance variables in a reader-friendly format.
     */
    /* Method for printing Tile object's attributes */
    public static void printTile(Tile paraTile) {
        System.out.printf("%3s : %3d\n", paraTile.letter, paraTile.value);
    }

    /* 5. Implement the toString and equals methods for a Tile. */
    /* Custom toString method for tile */
    public String toString() {
        return "[" + this.letter + "]:[" + this.value + "]";
    }

    /* Method that compares two Tile object attributes */
    public boolean equals(Tile paraTile) {
        return this.letter == paraTile.letter && this.value == paraTile.value;
    }

    /* 6. Create getters and setters for each of the attributes. */
    /* Getters for Tile attributes */
    public char getTileChar() {
        return this.letter;
    }

    public int getTileValue() {
        return this.value;
    }

    /* Setters for Tile attributes */
    public void setTileChar(char newChar) {
        this.letter = newChar;
    }

    public void setTileValue(int newValue) {
        this.value = newValue;
    }

}
