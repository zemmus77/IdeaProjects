package Day8;

public class MultiBranchStatement2 {
    public static void main(String[] args) {

        int currentSpeed = 65 ;
        if(currentSpeed> 90) {
            System.out.println("JAIL TIME!!!");
        }else if(currentSpeed > 80) {
            System.out.println("Reckless driving ");
        }else if(currentSpeed > 70) {
            System.out.println("Point taken! ");
        }else if(currentSpeed > 60) {
            System.out.println("warning!!! ");
        }else if(currentSpeed > 55) {
            System.out.println("Keep driving ");
        }else{
            System.out.println("KEEP DRIVING YOU ARE GOOD");
        }
    }
}
