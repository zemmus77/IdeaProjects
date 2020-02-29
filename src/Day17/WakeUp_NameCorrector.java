package Day17;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {
                    // 123456
        String name = "seRdAr" ;
        String nameFixed = name.toUpperCase().substring(0,1);
        nameFixed += name.substring(1).toLowerCase();
        System.out.println("NameFixed = " +nameFixed);

    }
}
