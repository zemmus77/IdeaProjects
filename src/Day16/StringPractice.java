package Day16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in) ;
        System.out.println("Enter the keyword to search ");
        String keyWordToSearch = scan.nextLine() ; //"Java" ;
        String tabTitle = keyWordToSearch + " - Google Search" ;
        if (tabTitle.startsWith( keyWordToSearch ) && tabTitle.endsWith(" - Google Search")) {
            System.out.println("TEST PASSED!!!");
        }else{
            System.out.println("TEST FAILED!!!");
        }
    }
}
