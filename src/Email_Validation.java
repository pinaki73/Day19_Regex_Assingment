import java.util.Scanner;
import java.util.regex.Pattern;

public class Email_Validation {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the email to validate");
        String e = a.nextLine();
        String email = "^([a-z0-9.-]+)@([a-z0-9]+).([a-z]{2,8})(.[a-z]{2,8})?$";
        if (Pattern.matches(email,e)== true){
            System.out.println("The email is valid");
        }else {
            System.out.println("The email is invalid");
        }

    }
}
