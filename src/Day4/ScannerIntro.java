package Day4;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

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
