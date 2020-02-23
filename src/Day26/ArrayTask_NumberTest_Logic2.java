package Day26;

public class ArrayTask_NumberTest_Logic2 {
    public static void main(String[] args) {
        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not
        // if all numbers are more than 100 then make it yes , if not make it no

        // LOGIC 2 :
        // Assume initial value for final Result is Yes
        // Check each item and
        // break as long as one number is less than 100  after assigning final result to NO
        // if we never go inside condition , the final result will remain YES

        int[] scores = {156, 101, 76, 187, 87, 110};
        int size = scores.length;
        System.out.println("size = " + size);

        String finalResult = "YES";

        for (int eachNum : scores) {

            if (eachNum <= 100) {
                finalResult = "NO";
                break;
            }

        }
        System.out.println("finalResult = " + finalResult);




    }
}
