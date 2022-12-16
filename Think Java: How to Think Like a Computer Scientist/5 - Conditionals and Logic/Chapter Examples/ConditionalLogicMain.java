class ConditionalLogicMain {

    public static void main(String[] args) {

        /*
         * Code that demonstrates the topics of chapter 5, exercises will be in a
         * different folder
         * 
         */

        // if statement

        int numOne = 2;

        if (numOne > 0) {

            System.out.println("[Numeber is positive]");

        }

        // switch statement

        String myAgent = "Sova";

        switch (myAgent) {

            case "Reyna":
            case "Jett":
            case "Yoru":
                System.out.println("Your Agent is a Duelist!");
                break;

            case "Sage":
            case "Killjoy":
            case "Cypher":
                System.out.println("Your Agent is a Sentinel!");
                break;

            default:
                System.out.println("Agent Not Found!");
                break;

        }

    }

}