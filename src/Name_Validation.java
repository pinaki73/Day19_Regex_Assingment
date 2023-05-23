import java.util.Scanner;
import java.util.regex.Pattern;

public class Name_Validation {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter the FirstName to validate");
        String firstname = v.nextLine();
        String Firstname = "^[A-Z][a-zA-z]{2}$";
        if (Pattern.matches(Firstname, firstname)) {
            System.out.println("The first name is valid");
        } else {
            System.out.println("The First name is invalid");
        }
        System.out.println("Enter the LastName to validate");
        String lastname = v.nextLine();
        String Lastname = "^[A-Z][a-zA-Z]{2}$";
        if (Pattern.matches(Lastname, lastname)) {
            System.out.println("The Last name is valid");
        } else {
            System.out.println("The  Last name is invalid");
        }
    }
}
