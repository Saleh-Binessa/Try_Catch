import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter your Username and Password:");
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";

        for (int i = 0; i <= 4; i++) {

            System.out.print("Username: ");
            String usernameInput = scanner.nextLine();

            System.out.print("Password: ");
            String passwordInput = scanner.nextLine();

            try {
                if (usernameInput.equals(validUsername) && passwordInput.equals(validPassword)) {
                    System.out.println("You are successfully logged in");
                    break;
                } else if (i < 4) {
                    throw new Exception("Invalid credentials");
                } else {
                    throw new Exception("Maximum attempts exceeded");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
