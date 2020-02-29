package Day5;
import java.util.Scanner;
public class GroceryTestAction {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("What is the price of tomato? ");
        double tomatoPrice = scan.nextDouble();
        System.out.println("How many pounds of tomato you want ? ");
        double tomatoPound = scan.nextDouble();
        System.out.println("What is the price of banana? ");
        double bananaPrice = scan.nextDouble();
        System.out.println("How many pounds of banana you want ? ");
        double bananaPound = scan.nextDouble();

        System.out.println("You buy "+tomatoPound+" pounds of tomato and the price is "+tomatoPrice+ " dollars.");
        System.out.println("You buy "+bananaPound+" pounds of banana and the price is "+bananaPrice+ " dollars.");

    }
}
