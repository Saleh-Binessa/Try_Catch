import java.util.Scanner;

public class Bonus1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";

        while (true) {

            System.out.print("Username: ");
            String usernameInput = scanner.nextLine();

            System.out.print("Password: ");
            String passwordInput = scanner.nextLine();

            try {
                if (usernameInput.equals(validUsername) && passwordInput.equals(validPassword)) {
                    System.out.println("You are successfully logged in");
                    break;
                } else {
                    throw new Exception("Invalid credentials");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
