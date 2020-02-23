package com.company;



import java.util.Scanner;

public class repl27 {
    public static void main(String[] args) {
        Scanner school = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = school.next();
        Double grade1 = school.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = school.next();
        Double grade2 = school.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = school.next();
        Double grade3 = school.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = school.next();
        Double grade4 = school.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = school.next();
        Double grade5 = school.nextDouble();

        String summary =  subject1 +" - " + grade1 +", "
                + subject2 +" - " + grade2 +", "
                + subject3 +" - " + grade3 +", "
                + subject4 +" - " + grade4 +", "
                + subject5 +" - " + grade5;
        Double averageScore = (grade1+grade2+grade3+grade4+grade5)/5 ;

        System.out.println("Summary: " + summary);
        System.out.println("Your average score is: " + averageScore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");


    }

}
