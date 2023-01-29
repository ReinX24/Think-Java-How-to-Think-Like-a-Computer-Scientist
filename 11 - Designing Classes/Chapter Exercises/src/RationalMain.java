public class RationalMain {

    public static void main(String[] args) {

        /*
         * Exercise 11.5 A rational number is a number that can be represented as
         * the ratio of two integers. For example, 2/3 is a rational number, and you can
         * think of 7 as a rational number with an implicit 1 in the denominator.
         */

        /*
         * 4. Write a main method that creates a new object with type Rational, sets
         * its instance variables to some values, and displays the object.
         */

        /*
         * 5. At this stage, you have a minimal testable program. Test it and, if
         * necessary, debug it.
         */
        Rational noParaTest = new Rational();
        noParaTest.printRational();

        Rational rationalOne = new Rational(1, 2);
        rationalOne.printRational();
        System.out.println(rationalOne.toString());
        rationalOne.negate(); // makes the integers negative
        rationalOne.printRational();

        Rational rationalTwo = new Rational(-2, -4);
        rationalTwo.printRational();
        rationalTwo.negate(); // makes the integers positive
        rationalTwo.printRational();
        rationalTwo.invert();
        rationalTwo.printRational();
        System.out.println(rationalTwo.toDouble());
        System.out.println(rationalOne.toDouble());

        System.out.println();

        Rational gcdTest = new Rational(270, 192);
        gcdTest.printRational();
        System.out.println(gcdTest.greatestCommonDenominator());
        rationalOne.printRational();
        System.out.println(rationalOne.greatestCommonDenominator());
        rationalTwo.printRational();
        System.out.println(rationalTwo.greatestCommonDenominator());

        System.out.println("Adding Two Fractions with the same denominator");

        Rational addOne = new Rational(1, 3);
        Rational addTwo = new Rational(1, 3);
        Rational rationalSumOne = addOne.add(addTwo);
        addOne.printRational();
        addTwo.printRational();
        rationalSumOne.printRational();

        System.out.println("Adding Two Fractions with different denominators");

        Rational addThree = new Rational(2, 5);
        Rational addFour = new Rational(2, 6);
        addThree.printRational();
        addFour.printRational();
        Rational rationalSumTwo = addThree.add(addFour);
        rationalSumTwo.printRational();

    }

}
