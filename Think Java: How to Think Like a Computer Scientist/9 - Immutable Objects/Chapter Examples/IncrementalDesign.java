public class IncrementalDesign {

    public static void main(String[] args) {
        
        // Prints multiples of 1 to 6   
        for (int i = 1; i <= 6; i++) {
            printMulTable(i, 5);
        }

    }

    public static void printMulTable(int multiplierNum, int columnNum) {
        for (int i = 1; i <= columnNum; i++) {
            System.out.printf("%4d", multiplierNum * i);
        }
        System.out.println();
    }
    
}
