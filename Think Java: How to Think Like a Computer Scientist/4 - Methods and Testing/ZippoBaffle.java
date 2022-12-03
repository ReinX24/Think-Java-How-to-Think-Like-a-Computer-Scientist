public class ZippoBaffle {

    public static void main(String[] args) {
        
        // Exercise 4.2
        
        zippo("rattle", 13); // involes the zippo method

    }

    public static void baffle(String blimp) { // method that takes a string as a parameter
        // the String inserted in the parameter will be named blimp within this method
    
        System.out.println(blimp);
        zippo("ping", -5);

    }

    public static void zippo(String quince, int flag) { // method that takes a String and an integer

        if(flag < 0) {

            System.out.println(quince + " zoop");

        }

        else {

            System.out.println("ik");
            baffle(quince); // uses the baffle method
            System.out.println("boo-wa-ha-ha");

        }

        /* 
         * Summarizing program flow
         *  1. The zippo method is called in the main method
         *  2. Within the zippo method, the else statement is ran
         *  3. Prints "ik"
         *  4. Within this method, the baffle method is invoked
         *  5. The baffle method takes in the quince variable which contains the String "rattle"
         *  6. That String is then printed in the baffle method
         *  7. zippo method is once again called with "ping" and -5 as parameters
         *  8. within the zippo method, the first if statement is invoked
         *  9. it prints quince that contains the String "ping" and adds " zoop" at the end
         * 10. it then returns to the else statement at the start and prints "boo-wa-ha-ha"
         * 
        */

    }
    
}
