import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.lang.*;

public class PasswordChecker {
    static String lowerCase = ".*[a-z].*";
    static String upperCase = ".*[A-Z].*";
    static String digit = ".*[0-9].*";
    static String specialChars = "(.*[^0-9,a-z,A-Z].*)";
    static Logger logger = LogManager.getLogger(PasswordChecker.class);

    public static String passwordIsValid(String password){

        String results = "";
        if (password.isEmpty()) {
            results = "password should exist";

        }else if (password.length() < 8) {
            results = "password should be longer than than 8 characters";

        }else if (!password.matches(lowerCase)) {
            results = "password should have at least one lowercase letter";

        }else if (!password.matches(upperCase)) {

            results = "password should have at least one uppercase letter";
        }else if (!password.matches(digit)) {

            results = "password should at least have one digit";
        }else if (!password.matches(specialChars)) {

            results = "password should have at least one special character";
        }

        return results;
    }
    public static Boolean passwordIsOk (String password){
        int metConditions = 6;
        if (password.isEmpty()) {
            metConditions--;
        }
        if (password.length() < 8) {
            metConditions--;
         }

        if (!password.matches(lowerCase)) {
            metConditions--;

        }
        if (!password.matches(upperCase)) {
            metConditions--;

        }
        if (!password.matches(digit)) {

            metConditions--;
        }
        if (!password.matches(specialChars)) {
            metConditions--;
        }
//
        boolean passwordIsOk = false;
        if (metConditions >= 3) {
            passwordIsOk = true;
        }
        return passwordIsOk;

    }
}
