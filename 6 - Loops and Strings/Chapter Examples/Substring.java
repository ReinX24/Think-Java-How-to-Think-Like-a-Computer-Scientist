public class Substring {

    public static void main(String[] args) {

        /*
         * The .substring method returns a part of the String that the method is used on
         * 
         */

        String strOne = "Fracture";

        System.out.println(strOne.substring(0, 6)); // starts the the first index and ends and cuts at the second one
        System.out.println(strOne.substring(3, 7)); // prints only part of the String
        System.out.println(strOne.substring(7, 7)); // prints nothing, cuts and ends at second index

        // .substring with only one parameter

        System.out.println(strOne.substring(0)); // prints the entire String
        System.out.println(strOne.substring(2)); // starts index and prints all at the right
        System.out.println(strOne.substring(8)); // prints nothing

    }

}
