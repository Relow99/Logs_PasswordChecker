import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PasswordChecker {
    private static final Logger logger = LogManager.getLogger(PasswordChecker.class.getName());

    static String lowerCase = ".*[a-z].*";
    static String upperCase = ".*[A-Z].*";
    static String digit = ".*[0-9].*";
    static String specialChars = "(.*[^0-9,a-z,A-Z].*)";

    public static String passwordIsValid(String password) throws Exception {
        String results = "";
        if (password.isEmpty()) {
            results = "password should exist";
            logger.error("- password should exist");
//                throw new Exception("- password should exist");

        }else if (password.length() < 8) {
            results = "password should be longer than than 8 characters";
            logger.error("- password should be longer than than 8 characters");
//                    throw new Exception("- password should be longer than than 8 characters");

        }else if (!password.matches(lowerCase)) {
            results = "password should have at least one lowercase letter";
            logger.error("- password should have at least one lowercase letter");
//                        throw new Exception("- password should have at least one lowercase letter");

        }else if (!password.matches(upperCase)) {
            results = "password should have at least one uppercase letter";
            logger.error("- password should have at least one uppercase letter");
//          throw new Exception("- password should have at least one uppercase letter");

        }else if (!password.matches(digit)) {
            results = "password should at least have one digit";
            logger.error("- password should at least have one digit");
//          throw new Exception("- password should at least have one digit");

        }else if (!password.matches(specialChars)) {
            results = "password should have at least one special character";
            logger.error("- password should have at least one special character");
//          throw new Exception("- password should have at least one special character");

        }

        return results;
    }
    public static Boolean passwordIsOk (String password) throws Exception {

        int metConditions = 6;
        if (password.isEmpty()) {
            metConditions--;
            logger.debug("User password is not ok");
//            throw new Exception("the password is never OK if it doesn't exist and its" +
//                        " less than 8 characters are not met.");
        }
        if (password.length() < 8) {
            metConditions--;
            logger.debug("User password is not ok");
         }
        if (!password.matches(lowerCase)) {
            metConditions--;
            logger.debug("User password is ok");
//              throw new Exception("password is ok");
        }
        if (!password.matches(upperCase)) {
            metConditions--;
            logger.debug("User password is ok");
        }
        if (!password.matches(digit)) {
            metConditions--;
            logger.debug("User password is ok");
        }
        if (!password.matches(specialChars)) {
            metConditions--;
            logger.debug("User password is ok");
        }

        boolean passwordIsOk = false;
        if (metConditions >= 3) {
            passwordIsOk = true;
        }
        return passwordIsOk;

    }
}
