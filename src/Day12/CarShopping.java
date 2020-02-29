package Day12;

public class CarShopping {
    public static void main(String[] args) {
        String carBrand = "Corolla";
        int budget = 40000 ;
        int carPrice = 30000 ;
        if( carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice <= budget )) {
            System.out.println(" car acquired!!! ");

        }else {
            System.out.println("NOT WHAT I AM LOOKING FOR ");
        }

    }
}
