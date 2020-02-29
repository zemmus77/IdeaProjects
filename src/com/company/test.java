package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        System.out.println("a is wrong");
        String b = s.nextLine();
        System.out.println("b is correct");
        String c = s.nextLine();
        System.out.println("c is wrong");

    }
}
