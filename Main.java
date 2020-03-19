import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.lang.*;

public class Main{
    static Logger logger = LogManager.getLogger(PasswordChecker.class);

    public static void main (String[] args){
            Scanner scanner = new Scanner (System.in);
        logger.debug("please enter your password");
            String password = scanner.nextLine();
            try {
                logger.error(PasswordChecker. passwordIsValid(password));
            } catch (Exception e) {
                e.printStackTrace();
            }
            logger.error(PasswordChecker.passwordIsOk(password));
        }
    }

