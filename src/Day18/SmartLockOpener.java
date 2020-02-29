package Day18;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        // smart lock door has password
        //unless you enter correct password
        //it keep locking you out
        //keep asking until user enter correct one
        Scanner scan = new Scanner(System.in);
        System.out.println("Knock Knock !!");
        System.out.println("What's the Password?");
        String password = scan.next() ;
        while (! password.equals("B15")) {
            System.out.println("Wrong Password!!! Try Again!!!");
            password = scan.next() ;
        }
        System.out.println("Open Seseame");
    }
}
