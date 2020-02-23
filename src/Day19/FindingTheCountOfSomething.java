package Day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        int z = 0 ;
        for (int i = 1; i<=100; i++) {
            if (i % 15 == 0) {
                //System.out.println(i);
                //z=z+1;
                //z+=1;
                ++z;
            }

        }
        System.out.println("Counter = " +z);

    String name = "Esra Fidan" ;
        for (int x = 0; x < name.length(); x++) {
            System.out.println(name.charAt(x));
            if ( name.charAt(x) == 'a'){
                System.out.println("Bingo") ;
            }
                    }
        System.out.println(name);

    }


}
