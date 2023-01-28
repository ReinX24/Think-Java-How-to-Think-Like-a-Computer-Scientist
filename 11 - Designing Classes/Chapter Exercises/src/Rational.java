public class Rational {

    /*
     * 1. Define a class called Rational. A Rational object should have two
     * integer instance variables that store the numerator and denominator.
     */
    private int numerator;
    private int denominator;

    /*
     * 2. Write a constructor that takes no arguments and that sets the numerator
     * to 0 and denominator to 1.
     */
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /*
     * 7. Write a second constructor that takes two arguments and uses them to
     * initialize the instance variables.
     */
    /* Constructor with parameters */
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /*
     * 3. Write an instance method called printRational that displays a Rational
     * in some reasonable format.
     */
    public void printRational() {
        System.out.printf("%-3d / %3d\n", this.numerator, this.denominator);
    }

    /* 6. Write a toString method for Rational and test it using println. */
    public String toString() {
        return "[" + this.numerator + " / " + this.denominator + "]";
    }

    /*
     * 8. Write an instance method called negate that reverses the sign of a ra-
     * tional number. This method should be a modifier, so it should be void.
     * Add lines to main to test the new method.
     */
    public void negate() {
        this.numerator = ~(this.numerator - 1);
        this.denominator = ~(this.denominator - 1);
    }

    /*
     * 9. Write an instance method called invert that inverts the number by
     * swapping the numerator and denominator. It should be a modifier. Add
     * lines to main to test the new method.
     */
    public void invert() {
        int temp = this.denominator;
        this.denominator = this.numerator;
        this.numerator = temp;
    }

    /*
     * 10. Write an instance method called toDouble that converts the rational
     * number to a double (floating-point number) and returns the result. This
     * method is a pure method; it does not modify the object. As always, test
     * the new method.
     */
    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    /*
     * 11. Write an instance method named reduce that reduces a rational number
     * to its lowest terms by finding the greatest common divisor (GCD) of the
     * numerator and denominator and dividing through. This method should
     * be a pure method; it should not modify the instance variables of the
     * object on which it is invoked.
     * Hint: Finding the GCD only takes a few lines of code. Search the web
     * for “Euclidean algorithm”.
     */
    public int greatestCommonDenominator() {
        int numA = this.numerator;
        int numB = this.denominator;
        while (numB != 0) {
            int temp = numA;
            numA = numB;
            numB = temp % numB;
        }
        return numA;
    }

    /*
     * 12. Write an instance method called add that takes a Rational number as
     * an argument, adds it to this, and returns a new Rational object.
     * There are several ways to add fractions. You can use any one you want,
     * but you should make sure that the result of the operation is reduced
     * so that the numerator and denominator have no common divisor (other
     * than 1).
     */
    public Rational add(Rational paraRational) {

        Rational rationalSum = new Rational(0, 0);

        if (this.denominator == paraRational.denominator) {
            rationalSum.numerator = this.numerator + paraRational.numerator;
            rationalSum.denominator = this.denominator + paraRational.denominator;
            return rationalSum;
        } else {
            rationalSum.numerator = this.numerator * paraRational.denominator;
            rationalSum.denominator = this.denominator * paraRational.denominator;

            paraRational.numerator = paraRational.numerator * this.denominator;
            paraRational.denominator = paraRational.denominator * this.denominator;

            rationalSum.numerator += paraRational.numerator;

            int remainNum, numOne, numTwo;
            numOne = rationalSum.numerator;
            numTwo = rationalSum.denominator;
            remainNum = numOne % numTwo;
            while (remainNum != 0) {
                remainNum = numOne % numTwo;
                numOne = numTwo;
                numTwo = remainNum;
            }
            int GCD = numOne;

            rationalSum.numerator = rationalSum.numerator / GCD;
            rationalSum.denominator = rationalSum.denominator / GCD;

            return rationalSum;
        }
    }

}
