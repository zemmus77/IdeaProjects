package Day5;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        //ask user for name
        //print your name is is
        // ask user for
        Scanner scan = new Scanner (System.in) ;
        //ask user to enter name
        System.out.println("Enter your name : ");
        // capture what user typer on keyboard in console

        String firstName = scan.next();
        // print the result of what we saved from user inout
        System.out.println("You have entered: " +firstName);

        int age = scan.nextInt();
        System.out.println("Your age is : " +age);


    }
}
