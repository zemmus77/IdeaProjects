package com.company;

import java.util.Scanner;

public class Repl97 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int wordLength = word.length();
        int javaCount = 0;


        for (int i=0; i<=wordLength-4; i++){
            String currentWord = word.substring (i, i+4);
            if(currentWord.equals("java")){
                javaCount++;
            }
        }
        System.out.println(javaCount);



    }
}
