package Day20;

public class SumOfEvenOddSeparately {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        for( int x=10; x<=100; x++){
            if( x%2 == 0){
                even = even +x;
            }else{
                odd = odd +x;
            }

        }
        System.out.println("Sum of Even: " + even);
        System.out.println("Sum of Odd: " + odd);
    }
}
