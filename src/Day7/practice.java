package Day7;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name, last name company seperated by space : ");
        String firstName, lastName, company, email;
        firstName = scan.next();         // "Serdar"
        lastName = scan.next();          //"Test"
        company = scan.next();           // "Ps"
        email = firstName + "_" + "@" + company + ".com";

        System.out.println("My name is " + firstName + " " + lastName + " and I work for "
                + company + " my email: " + email);
    }
}