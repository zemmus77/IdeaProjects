package Day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] nums = {13, 31, 8, 5, 21, 2} ;
        System.out.println("nums = " + Arrays.toString(nums));

        int numsitemCount = nums.length ;
        int [] numsCopy = new int[numsitemCount] ;
numsCopy[0] = nums[0] ;
        numsCopy[1] = nums[1] ;
        numsCopy[2] = nums[2] ;
        numsCopy[3] = nums[3] ;
        numsCopy[4] = nums[4] ;
        numsCopy[5] = nums[5] ;
        System.out.println("nums = " + Arrays.toString(nums));
        for (int x = 0; x < numsitemCount ; x++) {
numsCopy[x] = nums [x] ;

        }
        System.out.println("nums = " + Arrays.toString(nums));

        Arrays.sort (numsCopy) ;
        System.out.println("Sorted : " + Arrays.toString(numsCopy));


        if (Arrays.equals(nums, numsCopy)) {
            System.out.println("Already sorted: ");

        }else{
            System.out.println("Array is not Sorted" );
        }


    }
}
