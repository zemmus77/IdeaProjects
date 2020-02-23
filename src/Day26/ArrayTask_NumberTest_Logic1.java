package Day26;

public class ArrayTask_NumberTest_Logic1 {
    public static void main(String[] args) {
        int[] scores = {156, 101, 76, 187, 87, 110};
        int size = scores.length;
        System.out.println("size = " + size);

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

// if all numbers are more than 100 then make it yes , if not make it no

        String finalResult = "";
        // LOGIC 1.2 :
        // take each item check if it is MORE than 100, increase the count.
        // in the end if count is equal to array item count the finalResult Yes, answer is NO,

        int cntMoreThan100 = 0;
        for (int eachNum : scores) {

            if (eachNum > 100) {
                ++cntMoreThan100; // increasing the counter
            }

        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);
        // if all the numbers are more than 100 , it will have same count as item count
        if (cntMoreThan100 == size) {
            finalResult = "YES";
        } else {
            finalResult = "NO";
        }
        System.out.println("finalResult = " + finalResult);


        // LOGIC 2 :
        // Check each item and break when number is less than 100  after assigning final result to NO

        // LOGIC 3 :
        // minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

        // LOGIC 4 :
        // find min number if min number more than 100 yes




    }
}
