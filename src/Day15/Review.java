package Day15;

public class Review {
    public static void main(String[] args) {
        String name = "Serdar Muhammedov" ;
        System.out.println("name contains st Result is" + name ) ;
        String uppercaseName = name.toUpperCase() ;
        System.out.println("uppercase contains st or not? " + uppercaseName.contains("ST"));
        String lowercaseName = name.toLowerCase() ;
        System.out.println("Lowercase contains or not? " + lowercaseName.contains("st"));
        System.out.println(name.toLowerCase().contains("st"));
    }
}
