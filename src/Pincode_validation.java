import java.util.Scanner;
import java.util.regex.Pattern;

public class Pincode_validation {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter a pincode to validate");
        String a = v.nextLine();
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        if (Pattern.matches(regex,a) == true){
            System.out.println("The pincode is valid");
        }else{
            System.out.println("The pattern is invalid");
        }

    }
}
