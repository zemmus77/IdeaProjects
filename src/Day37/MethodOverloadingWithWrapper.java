package Day37;

public class MethodOverloadingWithWrapper {
    public static void main(String[] args) {

   printNum(100);
   printNum(Integer.valueOf(100));


    }

    public static void printNum(int x) {
        System.out.println("Printing Primitive object x = " + x);
    }

    public static void printNum(Integer x) {
        System.out.println("Printing Integer object x = " + x);

    }
}