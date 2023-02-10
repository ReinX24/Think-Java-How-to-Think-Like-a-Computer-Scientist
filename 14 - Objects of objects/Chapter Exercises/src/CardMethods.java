public interface CardMethods {

    /* Methods that should be implemented in the Card class */

    String toStringCard(); // toString method

    boolean equals(Card comparedCard); // if two cards are the same

    int compareTo(Card comparedCard); // compares the values of two cards

    int getRank(); // returns a number signifying the Rank of the Card

    String getSuit(); // returns String of the suit of the Card

}