public class ImmutableStrings {

    public static void main(String[] args) {

        String strOne = "Alan Turing"; // original String
        String strOneUpper = strOne.toUpperCase(); // creates a new String object, original not modified
        System.out.println(strOne + " : " + strOneUpper);
        strOne.toUpperCase(); // does not affect original String
        System.out.println(strOne);
        strOne = strOne.toUpperCase(); // references a new String object
        System.out.println(strOne);

        String strTwo = "Information Technology is fun!";
        System.out.println(strTwo);
        strTwo = strTwo.replace("Information Technology", "I.T."); // references a new String object
        System.out.println(strTwo);

    }

}
