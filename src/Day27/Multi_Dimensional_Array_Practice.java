package Day27;

import java.util.Arrays;
import java.util.Spliterator;

public class Multi_Dimensional_Array_Practice {
    public static void main(String[] args) {
        //        0                         1
        //   0           1              0       1
        String[][] names = {{"hello", "Everybody"}, {"World", "Good"}};
        //print World
        System.out.println(names[0][0] + " " + names[1][0]);

        // print good
        names[1][1] = "Nice";
        System.out.println(names[1][1]);

        System.out.println(Arrays.toString(names[1]));
        System.out.println(Arrays.deepToString(names));
        System.out.println("--------------------");
        //              0
        //        0          1
        //   0          1         2
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //System.out.println(Arrays.toString(numbers[0]));
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(Arrays.toString(numbers[i]));
        }
        System.out.println("\n ===========================================");
        int[][] ages = {{10}, {12, 13, 14, 15, 16}, {19, 20, 21, 22, 23, 24, 25}};
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                // if (ages [i] [j] %2 !=0) {
                //   continue;

                // System.out.print(ages[i] [j] + " ");
                if (ages[i][j] % 2 == 0) {
                    System.out.print(ages[i][j] + " ");
                }

            }
        }
    }
    }

