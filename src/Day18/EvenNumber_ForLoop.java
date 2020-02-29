package Day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i<20 ; i += 3 ) {
            System.out.println(i + " ");
        }
        System.out.println("__________________");
        for (int i = 0; i<20; i++){
            if (i%2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
