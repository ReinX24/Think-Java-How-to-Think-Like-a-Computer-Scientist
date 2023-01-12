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
        System.out.println('a' + 'a'); // char works, results in a number
        System.out.println('a' + 5); // int works, results in a number
        System.out.println('a' + 1.555); // double works, results in a number
        System.out.println("Pog " + 'a'); // concatenates normally

    }

}