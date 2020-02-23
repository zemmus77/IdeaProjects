package Day22;

public class ArrayCreation2 {
    public static void main(String[] args) {
        int[] ages = new int[] {3,5,11,33,57,18};
        int itemCount = ages.length;
        System.out.println("itemCount = " +itemCount);
        System.out.println("ages = " + ages);
        for (int x = 0; x <itemCount ; x++) {
            System.out.println(ages[x]);

        }
        int[] areaCode = {703, 300, 862, 665 } ;
        for (int i = 0; i <itemCount ; i++) {
            System.out.println(ages[i]);
            System.out.println(areaCode[i] + " ");
        }
    }
}
