package Day8;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
    /* voting Eligibility Program
    create a variable called age as int
    check whether this age is more than 18
    if yes print: you are ready to vote!!!
    if it's less 18 print wait until you are 18

    *Create a prgram to guess your favorite number create a variable called myFavoriteNumber as int

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        if (age >= 18)
            System.out.println("You are ready to vote!");
        else
            System.out.println("Wait until you are 18!");






    }
}
