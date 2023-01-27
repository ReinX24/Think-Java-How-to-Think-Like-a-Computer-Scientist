public class StartCountUp {

    public static void main(String[] args) {
        countUp(1, 10);
    }

    public static void countUp(int startNum, int endNum) {
        if (endNum < startNum) {
            System.out.println("[Start!]");
        } else {
            countUp(startNum, endNum - 1);
            System.out.println(endNum);
        }
    }

}
