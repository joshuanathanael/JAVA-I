import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1103331_0421_1{
    public static void main(String [] argv){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address:");
        String email = sc.nextLine();

        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Email address is not valid");
        }

    }
}