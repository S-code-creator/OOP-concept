import java.util.*;

public class LMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        // Sample user for demonstration
        users.add(new Admin("A1", "Admin User", "admin@example.com"));

        System.out.println("Welcome to LMS. Enter User ID:");
        String inputId = scanner.nextLine();

        // Find user
        for (User user : users) {
            if (user.id.equals(inputId)) {
                user.displayMenu();
                break;
            }
        }
    }
}

