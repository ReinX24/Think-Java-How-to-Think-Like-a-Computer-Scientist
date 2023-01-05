public class BottlesOfBeer {

    public static void main(String[] args) {

        /*
         * Exercise 8.1 The purpose of this exercise is to take a problem and break
         * it into smaller problems, and to solve the smaller problems by writing simple
         * methods. Consider the first verse of the song “99 Bottles of Beer”:
         * 99 bottles of beer on the wall,
         * 99 bottles of beer,
         * ya’ take one down, ya’ pass it around,
         * 98 bottles of beer on the wall.
         * 
         * Subsequent verses are identical except that the number of bottles gets
         * smaller
         * by one in each verse, until the last verse:
         * 
         * No bottles of beer on the wall,
         * no bottles of beer,
         * ya’ can’t take one down, ya’ can’t pass it around,
         * ’cause there are no more bottles of beer on the wall!
         * 
         */

        bottlesOfBeer(99);

    }

    public static void bottlesOfBeer(int beerBottles) {
        if (beerBottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println(beerBottles + " bottles of beer on the wall,");
            System.out.println(beerBottles + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println(beerBottles - 1 + " bottles of beer on the wall.");
            bottlesOfBeer(beerBottles - 1);
        }
    }

}