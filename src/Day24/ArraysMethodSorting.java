package Day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int[] scores ={99,44,66,19,55} ;
        System.out.println(Arrays.toString (scores));
        System.out.println("Original first item value : " + scores[0]);

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("New First item value : " + scores[0]);


    }
}
