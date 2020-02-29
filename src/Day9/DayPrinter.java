package Day9;

public class DayPrinter {
    public static void main(String[] args) {
        String dayName = "" ;
        int dayCode  = 3;
        if (dayCode == 1)         {
            dayName = "monday";

            //System.out.println("Day is Monday ");
        } else if (dayCode == 2) {
            dayName = "tuesday";
            //System.out.println("Day is Tuesday ");
        } else if (dayCode == 3) {
            dayName = "wednasday";
            //System.out.println("Day is Wednesday ");
        } else if (dayCode == 4) {
            dayName = "thursday";
            //System.out.println("Day is Thursday ");
        } else if (dayCode == 5) {
            dayName = "friday";
            //System.out.println("Day is Friday ");
        } else if (dayCode == 6) {
            dayName = "saturday";
            //System.out.println("Day is Saturday ");
        } else if (dayCode == 7) {
            dayName = "sunday";
        }else{
            dayName = "UNKNOWN!!!" ;

            //System.out.println("Day is Sunday ");
        }
        System.out.println("Day is " + dayName);
    }
}
