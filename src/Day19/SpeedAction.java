package Day19;

import java.util.Scanner;

public class SpeedAction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your starting speed  and ending speed: ");
        int start= scan.nextInt() ;
        int end = scan.nextInt();

        for (int i = start ; i <= end ; i++) {
            System.out.println(i+ " ");

        }
        System.out.println("Your starting speed is :");
    }
}
//int x = 1 ;
// do {
//     System.out.println(x);
//     ++x;
// } while (x<=5);
//        System.out.println("_____________");
// // count 5 to 1
//        int y = 5 ;
//        do {
//            System.out.println(y);
//            --y;
//        } while (y>0);