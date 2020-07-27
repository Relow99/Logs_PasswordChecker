import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        String password;
        Scanner passwordInput = new Scanner(System.in);
        System.out.println("Please Enter Password");
        password = passwordInput.nextLine();

        try {
            PasswordChecker.passwordIsValid(password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
           PasswordChecker.passwordIsOk(password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

