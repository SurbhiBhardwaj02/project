import com.InvalidCountryException;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       String name=s.nextLine();
       String country= s.nextLine();
        UserRegistration obj1=new UserRegistration();
        try{
            obj1.registerMethod(name,country);
        }
        catch (InvalidCountryException e){
            System.out.println(e);
        }
    }
    public void registerMethod(String username, String usercountry ) throws InvalidCountryException {
        if(usercountry.equals("india"))
            System.out.println("User registration done successfully");
        else
            throw new InvalidCountryException();
    }
}
