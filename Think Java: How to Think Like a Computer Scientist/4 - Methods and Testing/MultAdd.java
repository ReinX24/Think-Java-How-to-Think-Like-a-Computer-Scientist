public class MultAdd {
    
    public static void main(String[] args) {

        // Exercise 4.6
        // Think Java Book
        
        System.out.println("multAdd Result 1: " + multAdd(1, 2, 3)); // correct

        System.out.println("multAdd Result 2: " + multAdd(1, Math.sin(Math.PI/4), (Math.cos(Math.PI/4)/2))); // correct

        System.out.println("multAdd Result 3: " + multAdd(1, Math.log10(10), Math.log10(20))); // correct

        System.out.println("expSum Result 1: " + expSum(5));

        System.out.println("yikes Result 1: " + yikes(5););

        
       

    }

    public static double multAdd(double numOne, double numTwo, double numThree) {

        return numOne * numTwo + numThree;

    }

    // A method that calls the multAdd method
    public static double expSum(double x) {

        double numOne = x; // x
        double numTwo = Math.exp(-x); // e^-x
        double numThree = Math.sqrt(1 - numTwo); // Square root of 1 - e^-x (e^-x from numTwo)
        double expSumResult = multAdd(numOne, numTwo, numThree);
        return expSumResult;

    }

    // A method that does the same as expSum but from Allen Downey
    public static double yikes(double x) {
		double a = x;
		double b = Math.exp(-x); 
		double c = Math.sqrt(1.0 - b);
		double yikesResult = multAdd(a, b, c);
        return yikesResult;
	}



}
