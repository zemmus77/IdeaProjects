package com.company;

import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        int strLength = str.length();
        String prefix = str.substring(0,n);
        int prefixCount = 0;
        int prefixLength = prefix.length();
        for (int i = 0; i <= strLength -4 ; i++) {
            String currentChars = str.substring(i, i+prefixLength) ;
            if (currentChars.equals(prefix)){
                prefixCount++;
            }

        }
        System.out.println(prefixCount>1);



    }
}
