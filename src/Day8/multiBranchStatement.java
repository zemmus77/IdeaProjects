package Day8;

public class multiBranchStatement {
    public static void main(String[] args) {
        int currentSpeed = 60 ;
        if(currentSpeed> 70) {
            System.out.println("you are speeding more than 70 -- POINTS TAKEN!!!");
        }else if(currentSpeed > 60) {
            System.out.println("Your speed is less than 70 but more than 60 ");
        }else{
            System.out.println("KEEP DRIVING YOU ARE GOOD");
        }
    }
}
