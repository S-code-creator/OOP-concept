public class Admin extends User {

    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayMenu() {
        System.out.println("1. Add User\n2. Remove User\n3. Add Course\n4. Remove Course");
        // Handle input here...
    }

    public void addUser() {
        // Implementation
    }

    public void removeUser() {
        // Implementation
    }

    public void addCourse() {
        // Implementation
    }

    public void removeCourse() {
        // Implementation
    }
}

