package Day5;

import java.util.Scanner;


public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        // asking user are you recording
        System.out.println("Are you recording ? ");
        boolean isRecording = input.nextBoolean();

        //RESULT of concatenating
        System.out.println("We are recording " + isRecording );

    }
}
