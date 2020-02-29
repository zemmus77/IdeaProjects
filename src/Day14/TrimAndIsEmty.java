package Day14;

public class TrimAndIsEmty {
    public static void main(String[] args) {
        String message = "     REPL IS COMING !" ;
        System.out.println(message);
        System.out.println("count: " + message.length());
        message = message.trim();
        System.out.println(message);
        System.out.println("count: " + message.length());
        System.out.println(message.isEmpty());
    }
}
