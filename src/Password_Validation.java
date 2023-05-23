import java.util.Scanner;
import java.util.regex.Pattern;

public class Password_Validation {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter password to validate");
        String p = b.nextLine();
        String password = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,20}$";
        if (Pattern.matches(password,p) == true){
            System.out.println("The password is valid");
        }else{
            System.out.println("The password is invalid");
        }
    }
}
