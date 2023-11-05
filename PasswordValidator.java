import java.util.regex.*;

public class PasswordValidator {

    public static boolean validatePassword(String password) {
        // Check if the password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        // Check if the password contains at least one lowercase letter
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }

        // Check if the password contains at least one digit
        if (!Pattern.compile("\\d").matcher(password).find()) {
            return false;
        }

        // Check if the password contains at least one special character
        if (!Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(password).find()) {
            return false;
        }

        // If all the conditions are met, the password is valid
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input your password: ");
        String password = scanner.nextLine();
        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Valid Password.");
        } else {
            System.out.println("Password does not meet requirements.");
        }
    }
}