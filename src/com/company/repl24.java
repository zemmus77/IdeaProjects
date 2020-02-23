package com.company;

import java.util.Scanner;

public class repl24 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in) ;
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println( "Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        int workPhone = scan.nextInt();
        System.out.println("Enter your personal phone number");
        int personalPhone = scan.nextInt();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        Double height = scan.nextDouble();
        System.out.println("Enter your weight");
        Double weight = scan.nextDouble();
        System.out.println("Are you married?");
        String married = scan.next();

        String contact = "work phone number - " +workPhone+", " + "personal phone number - "+ personalPhone+ ", "+"email: " + email ;
        String fullName = firstName +", " + lastName ;
        String address = street + " " + city +" "+ state +" "+ zipCode ;

        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: "  +contact);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Married?: " +married);






    }
}
