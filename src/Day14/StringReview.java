package Day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "Pumpkin" ;
        System.out.println(str.equals("Does it contans pumpkin: "));
        System.out.println( str.contains("Pumpkin"));
        boolean gotPumpkin = str.contains("pumpkin") ;
        System.out.println("gotPumpkin = " + gotPumpkin);
    }
}
