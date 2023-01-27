public class AddConcat {

    public static void main(String[] args) {

        /*
         * Exercise 9.1 The point of this exercise is to explore Java types and fill in
         * some of the details that aren’t covered in the chapter.
         * 
         */

        // Row 1
        System.out.println(true + " pog"); // only boolean works for 1st row
        // Row 2
        System.out.println('a' + 'a'); // char works, results in a number (ASCII decimal value)
        System.out.println('a' + 5); // int works, results in a number
        System.out.println('a' + 1.555); // double works, results in a number
        System.out.println("Pog " + 'a'); // concatenates normally
        // Row 3
        System.out.println(1 + 'a'); // adds to int equivalent of the char
        System.out.println(1 + 3); // int & int
        System.out.println(1 + 1.256); // int & double
        System.out.println(2 + " number"); // int & String
        // Row 4
        System.out.println(5.56 + 'a'); // double & char
        System.out.println(5.25 + 2); // double & int
        System.out.println(2.45 + 1.65); // double & double
        System.out.println(5.556 + " double"); // double & String
        // Row 5
        System.out.println("Boolean " + false); // String & boolean
        System.out.println("Char " + 'a'); // String & char
        System.out.println("int " + 5); // String & int
        System.out.println("double " + 6.34563); // String & double
        System.out.println("Hello " + "World"); // String & String

        int numX = 1;
        numX = numX + 1;
        System.out.println(numX); // 2
        char charX = 'a';
        // charX = charX + 1; // cannot convert from int to char
        charX++; // is legal, goes to 'b' or next character
        System.out.println(charX); // 'b'

        String emptyString = "";
        System.out.println(emptyString + 5); // just shows 5

    }

}