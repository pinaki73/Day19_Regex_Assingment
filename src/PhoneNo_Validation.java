import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNo_Validation {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter a phone no to validate");
        String phoneNo = p.nextLine();
        String PhNo = "^[0-9]{2}\\s{1}[0-9]{10}$";
        if(Pattern.matches(PhNo,phoneNo) == true){
            System.out.println("The phoneNo is valid");
        }else{
            System.out.println("The phoneNo is not valid");
        }
    }
}
