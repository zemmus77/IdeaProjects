package Day19;

public class ForLoopStairCase {
    public static void main(String[] args) {
        String star = "* " ;
        System.out.println(star);

        star = star + "* " ;
        System.out.println(star);

        star = star + "* " ;
        System.out.println(star);

        star = star + "* " ;
        System.out.println(star);
        System.out.println("_______________");

        String x = "" ;
        for (int i = 1; i<=4; i++) {
            x += x +"* " ;
            System.out.println(i+ " " +star);
        }

    }
}
