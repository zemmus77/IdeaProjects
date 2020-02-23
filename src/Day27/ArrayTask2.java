package Day27;

public class ArrayTask2 {
    public static void main(String[] args) {
        int [] scores = {100, 897, 900, 1252 , 10, 1 , 2 , 3, 4, 5 , 9, -777};
        int min = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if (min>scores[i]) {
                min = scores[i] ;
            }
        }
        System.out.println("min = " + min);

        int secondMin = scores[0] ;
        for (int i = 0; i < scores.length ; i++) {
            if (scores [i] == min) {
                continue;
            }
            if (secondMin>scores[i] && scores[i] !=min){
                secondMin=scores[i];
            }
        }
        System.out.println("secondMin = " + secondMin);



    }
}
