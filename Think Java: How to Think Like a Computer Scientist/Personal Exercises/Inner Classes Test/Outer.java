public class Outer { // Outer class

    int numOne = 5; // needs an object to be directly accessed
    static int numTwo = 7; // can be directly accessed

    public void outerInfo() {

        System.out.println("numOne: " + numOne);
        System.out.println("numTwo: " + numTwo);

    }

    public void showInnerInfo() {

        Inner innerOne = new Inner();
        innerOne.innerInfo(); // shows the info within the inner class

    }

    public class Inner { // Inner class

        int numThree = 6;
        int numFour = 8;

        public void innerInfo() {

            System.out.println("numOne: " + numOne); // can access variables in Outer class
            System.out.println("numTwo: " + numTwo);
            System.out.println("numThree: " + numThree);
            System.out.println("numFour: " + numFour);

        }

    }

}
