import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test

    void passwordExists() {
        assertEquals("password should exist",PasswordChecker.passwordIsValid(""));
    }
    @Test
    void passwordLength() {
        assertEquals("password should be longer than than 8 characters",PasswordChecker.passwordIsValid("@TS1234"));
    }
    @Test
    void passwordLowercase(){
        assertEquals("password should have at least one lowercase letter",PasswordChecker.passwordIsValid("@TS12345"));
    }
    @Test
    void passwordUppercase(){
        assertEquals("password should have at least one uppercase letter",PasswordChecker.passwordIsValid("@ts12345"));
    }
    @Test
    void passwordDigit(){
        assertEquals("password should at least have one digit",PasswordChecker.passwordIsValid("@Tshwarelo"));
    }
    @Test
    void passwordSpecialChar() {
        assertEquals("password should have at least one special character", PasswordChecker.passwordIsValid("Tshwarelo22"));
    }
    @Test
    void passwordIsOk() {
        assertTrue(PasswordChecker.passwordIsOk("Tswarelo22"));
    }
}