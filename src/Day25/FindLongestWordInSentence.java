package Day25;

import java.util.Arrays;

public class FindLongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "We are trying to find longest word " ;
        String [] allWords = sentence.split(" ") ;
        System.out.println("allWords" + Arrays.toString(allWords));
        String longestWord = "";
        int maxCharCount = 0;
        for (String currentWord : allWords) {
            System.out.println("currentWord = " + currentWord);
            if (longestWord.length() > longestWord.length() ) {
                longestWord = currentWord ;
                
            }
        }
        System.out.println ("longestWord = " + longestWord);
        
        
    }
}
