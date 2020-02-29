package Day18;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SmartLock_DoWhileVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Knock Knock");
        String password;
        do {
            System.out.println("What's the Password?");
            password = scan.next();

        }while(!password.equals("B15"));
        System.out.println("DOOR IS OPEN!!!");
    }
}
