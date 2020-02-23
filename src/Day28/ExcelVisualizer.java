package Day28;

import java.util.Arrays;

public class ExcelVisualizer {
    public static void main(String[] args) {
        //{ {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67},{12,88,52,45},{67,33,98,34} };
        int [] row1 = new int [] {78,54,100,84} ;
        int [] row2 = new int [] {33,44,77,123} ;
        int [] row3 = new int [] {12,88,52,76} ;
        int [] row4 = new int [] {67,33,98,67} ;
        int [] row5 = new int [] {12,88,52,45} ;
        int [] row6 = new int [] {67,33,98,34} ;
// to store this in another array object
int[] [] sheet = new int [] [] {row1, row2, row3, row4 , row5, row6} ;

int [] [] myExcel = {{10,20},{40,60,20},{30,90,100,200}} ;
        System.out.println(myExcel[0][1]);
        System.out.println(myExcel[2][0]);
        System.out.println(myExcel.length); // printing whole row
        System.out.println(Arrays.toString(myExcel[0])); // printing only 1D array
        System.out.println(myExcel[0].length); //getting lenght or first 1D array
        System.out.println("================================================");

        for (int i = 0; i < myExcel.length ; i++) {
            System.out.println("Item number " + i + " -- length is: " + myExcel[i].length );

        }



    }
}
