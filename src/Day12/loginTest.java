package Day12;

public class loginTest {
    public static void main(String[] args) {
        String userName = "user123" , password = "efg" ;
        if(userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login Successful");
        }else if( ! userName.equals("user123") && password.equals("pass123")) {
            System.out.println("USERNAME NOT CORRECT!!!");

        }else  if ( userName.equals("user123") && ! password.equals("pass123")) {
            System.out.println("PASSWORD NOT CORRECT!!!");
        }else{
            System.out.println("USERNAME AND PASWORD ARE BOTH WRONG!!!!");
        }
    }
}
