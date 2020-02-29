package Day8;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int speedLimit = 60 ;
        int yourCurrentSpeed = 60 ;
        boolean amTSpeeding = (yourCurrentSpeed > speedLimit);

        if ( yourCurrentSpeed > speedLimit ) {
            System.out.println("Get pulled over by the Police");
            System.out.println("Given ticket by Police");
            System.out.println("Taken away some points on your license");
        }else {
            System.out.println("go shopping!!");
            System.out.println("Buy ice-cream!!");
            System.out.println("Enjoy your day!!");
        }
        System.out.println("THE END!!!");
    }
}


