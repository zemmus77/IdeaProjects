package Day31;

public class Voting {
    public static void main(String[] args) {
        checkEligibility(20);


    }
    public static void checkEligibility(int age) {

        if(age>18) {
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

}
