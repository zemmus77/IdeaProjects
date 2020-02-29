package Day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        String name = "Serdar" ;
        int x = 0 ;
        while (x < name.length()) {
            System.out.println( "index " + x + ":" + (name.charAt(x)));
            //System.out.println(name.charAt(x) );
            ++x ;
        }
       //
        //++x ;
    }
}
