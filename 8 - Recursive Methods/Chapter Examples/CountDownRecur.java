public class CountDownRecur {

    public static void main(String[] args) {
        
        countDown(10);
        // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, Blast off!

    }

    public static void countDown(int startNum) {
        if(startNum == 0) {
            System.out.println("Blast off!");
        }
        else {
            System.out.println(startNum);
            countDown(startNum - 1); // calls method again and subtracts by 1
        }
    }

}