package Day8;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("What is your current speed, dear driver: ");
        int currentSpeed = scan.nextInt();
        System.out.println("What is speed limit? ");
        int speedLimit= scan.nextInt();
        if ( currentSpeed >= speedLimit ) {
            System.out.println("Get pulled over by the Police");
            System.out.println("Given ticket by Police");
            System.out.println("Taken away some points on your license");
        }
        System.out.println("THE END!!!");
        }
    }
