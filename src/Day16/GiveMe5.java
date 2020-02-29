package Day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber = 5;
        while (userNumber != 5) {
            System.out.println("GIVE ME FIVE!!!");
            userNumber = scan.nextInt();
        }

    }
}
