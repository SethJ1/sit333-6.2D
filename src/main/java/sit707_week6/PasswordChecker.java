package sit707_week6;

public class PasswordChecker {

    public static boolean isStrongPassword(String password) {
        // Check if the password meets the criteria for a strong password
        // let's define a strong password as one that is at least 8 characters long
        // and contains at least one uppercase letter, one lowercase letter, and one digit.
        return password.length() >= 8 && containsUppercase(password) && containsLowercase(password) && containsDigit(password);
    }

    private static boolean containsUppercase(String password) {
        return !password.equals(password.toLowerCase());
    }

    private static boolean containsLowercase(String password) {
        return !password.equals(password.toUpperCase());
    }

    private static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}

