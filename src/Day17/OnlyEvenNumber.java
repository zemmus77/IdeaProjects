package Day17;

public class OnlyEvenNumber {
    public static void main(String[] args) {
        int x = 100 ;
        while (x >= 0) {
            if (x%2==1) {
                System.out.println(x + " is even number");
                --x;
            }
        }
    }
}
