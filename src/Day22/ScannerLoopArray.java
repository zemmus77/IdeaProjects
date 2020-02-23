package Day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10] ;
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println("Enter Your Number " + (x+1));
            numbers[x] = scan.nextInt();
            System.out.println(numbers[x]);

        }
        for (int x = 0; x <numbers.length ; x++) {
            System.out.println(numbers[x]+" ");

        }

    }
}
