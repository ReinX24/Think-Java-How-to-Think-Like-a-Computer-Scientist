public class ZoopBafflePing {

    public static void main(String[] args) {

        // Exercise 4.3
        // Think Java Book

        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();

        // Program Flow
        // No, I
        // Go to zoo method
        // baffle method
        // No, I wug
        // ping method
        // No, I wug. (println so new line)
        // go back to zoop
        // No, I wug.
        // You wugga
        // baffle method
        // No, I wug.
        // You wugga wug
        // ping method
        // No, I wug.
        // You wugga wug.
        
        // Prints I
        // I
        // baffle method
        // I wug
        // ping method
        // I wug.

        // Final output: 

        // No, I wug.
        // You wugga wug.
        // I wug.

    }

    public static void zoop() {

        baffle();
        System.out.print("You wugga ");
        baffle();

    }

    public static void baffle() {

        System.out.print("wug");
        ping();

    }

    public static void ping() {

        System.out.println(".");

    }

}