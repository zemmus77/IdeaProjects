package Day5;

import java.sql.SQLOutput;

public class VariablePractice {
    public static void main(String[] args) {
        // 8 primitives
        /*
         line1
         line2
         line3
        */
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear - birthYear ;
        //System.out.println("I was born in year" + 2001 +", and I am " + (2019-2001) + "years old");
        System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old");

        //task2: you are speeding today

        int speedLimit = 55 ;
        int currentSpeed = 65 ;
        int overTheLimit = currentSpeed - speedLimit ;
        System.out.println("You are driving " + overTheLimit + " mph more than speed limit");

    }
}
