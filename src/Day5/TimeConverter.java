package Day5;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("Type a number of days, please");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the hour that you would like to convert");
        int hour = scan.nextInt();
        int minute=hour*60;
        int seconds=60*minute;
        System.out.println("So "+hour+" hours is equal to "+seconds+ " seconds.");
        System.out.println("Enter your hourly wage ");
        double hourlyWage = scan.nextDouble();
        double yearlyWage=hourlyWage*2080;
        System.out.println("So you earn "+yearlyWage+ " dollars per year.");
        System.out.println("What is the price of tomato? ");
        double tomatoPrice = scan.nextDouble();
        System.out.println("How many pounds of tomato you want ? ");
        double tomatoPound = scan.nextDouble();
        System.out.println("What is the price of banana? ");
        double bananaPrice = scan.nextDouble();
        System.out.println("How many pounds of banana you want ? ");
        double bananaPound = scan.nextDouble();
        System.out.println("What is the price of apple? ");
        double applePrice = scan.nextDouble();
        System.out.println("How many pounds of apple you want ? ");
        double applePound = scan.nextDouble();
        System.out.println("You buy"+tomatoPound+" pounds of tomato and the price is "+tomatoPrice+ " dollars.");
        System.out.println("You buy"+bananaPound+" pounds of banana and the price is "+bananaPrice+ " dollars.");
        System.out.println("You buy"+applePound+" pounds of apple and the price is "+applePrice+ " dollars.");
    }
}
