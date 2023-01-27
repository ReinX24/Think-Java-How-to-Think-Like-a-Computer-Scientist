class InitializationApp {

    public static void main(String[] args) {

        ConInit objOne = new ConInit(); // creating a new object with the ConInit class
        System.out.println("Number: " + objOne.numOne); // prints number of object, prints 5
        /*
         * Explanation:
         * Constructors are the last to run when there are initialization blocks, which
         * makes numOne 5.
         * As for our intializers, it will run from top to bottom, this means the last
         * initializer for
         * that is within our class will be the one to run, in this case, numOne = 1;
         * If we remove our constructor, it will result in numOne = 1;
         * 
         */

    }

}