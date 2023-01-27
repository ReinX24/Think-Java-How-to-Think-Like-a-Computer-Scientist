public class SquareRoot {

    public static void main(String[] args) {

        System.out.println(squareRoot(9));

    }

    public static double squareRoot(double a) { // function that finds the square root of a number

        double oldVal = a / 2;
        double newVal = a / 2;
        double interVal = 0;

        do {

            oldVal = newVal; // stores new value in old value
            newVal = (oldVal + a / oldVal) / 2; // newVal will now have the value of the equation
            interVal = Math.abs(newVal - oldVal); // .abs turns a negative into a positive if the number is negative
            System.out.println(interVal); // prints interval

        } while (interVal > 0.001); // do loop runs while the interval is greater than 0.001

        return newVal;

    }

}
