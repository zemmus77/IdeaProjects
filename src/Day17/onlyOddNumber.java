package Day17;

public class onlyOddNumber {
    public static void main(String[] args) {
        int x = 100 ;
        while (x>0) {
            if (x%2 !=0 ){
                System.out.println(x + " is odd number");
            }
            --x ;
        }
    }
}
