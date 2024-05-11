package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest {

    @Test
    public void testRight() {
        // Right: Test if the result is correct
        Assert.assertTrue(PasswordChecker.isStrongPassword("Abcd123!"));
        Assert.assertFalse(PasswordChecker.isStrongPassword("password"));
    }

    @Test
    public void testBoundary() {
        // Boundary: Minimum length password
        Assert.assertFalse(PasswordChecker.isStrongPassword("Abcd123"));

        // Boundary: Maximum length password
        Assert.assertTrue(PasswordChecker.isStrongPassword("Abcd1234!"));

        // Boundary: Password with only lowercase letters
        Assert.assertFalse(PasswordChecker.isStrongPassword("password"));

        // Boundary: Password with only uppercase letters
        Assert.assertFalse(PasswordChecker.isStrongPassword("PASSWORD"));

        // Boundary: Password with only digits
        Assert.assertFalse(PasswordChecker.isStrongPassword("12345678"));
    }

    @Test
    public void testErrorConditions() {
        // Error Conditions: Password that does not meet any strength criteria
        Assert.assertFalse(PasswordChecker.isStrongPassword("abcd123"));
    }
}

