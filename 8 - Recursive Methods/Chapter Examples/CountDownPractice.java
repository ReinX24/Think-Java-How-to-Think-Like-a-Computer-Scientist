public class CountDownPractice {

    public static void main(String[] args) {
        countDown(100);
    }

    public static void countDown(int startNum) {
        if (startNum == 0) {
            System.out.println("[Blast Off!]");
        } else {
            System.out.println(startNum);
            countDown(startNum - 1);
        }
    }

}
