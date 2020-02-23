package Day20;

import javax.sound.midi.Soundbank;

public class ReversingAString {
    public static void main(String[] args) {
        String name = "Jon Snow" ;
        String reversedName = " ";
        int lastCharIndex = name.length()-1 ;
        for (int x= lastCharIndex; x>=0; x--){
            System.out.println(x+" index : ");
            char currentChar = name.charAt(x);
            System.out.println(currentChar);
            reversedName = reversedName + currentChar ;
        }
        System.out.println("reversName = " + reversedName);
    }

}
