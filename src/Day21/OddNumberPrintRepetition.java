package Day21;

public class OddNumberPrintRepetition {
    public static void main(String[] args) {
        for (int i = 0; i <=4 ; i++) {
            System.out.println("Iteration: " + i);

            for (int x = 1; x <= 10; x++) {
                if (x % 2 == 1) {
                    System.out.println("ODD #: " + x);
                }
            }
            System.out.println();
        }


    }
}
