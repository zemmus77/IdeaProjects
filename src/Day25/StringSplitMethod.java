package Day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String sentence = "I love Java" ;
        String[] allWords = sentence.split(" ") ;
        System.out.println("allWords = " + Arrays.toString(allWords) );
        System.out.println("How many word do I have in this sentence? : " + allWords.length );
        System.out.println("Last word in this sentence is: " + allWords[allWords.length-1]);
String sentence2 = "Everything is Awesome!!!" ;
String[] splitBy_e_Arr = sentence2.split("is") ;
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));
for (String eachPieces : splitBy_e_Arr) {
    System.out.println("eachPieces = <" + eachPieces+ ">");
}

    }
}
