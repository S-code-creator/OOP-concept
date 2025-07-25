import java.util.*;

public class Student extends User {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<String, String> grades = new HashMap<>();

    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayMenu() {
        System.out.println("1. Enroll in Course\n2. View Content\n3. View Grades");
        // Handle input...
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public void viewGrades() {
        for (String courseId : grades.keySet()) {
            System.out.println(courseId + ": " + grades.get(courseId));
        }
    }

    public void setGrade(String courseId, String grade) {
        grades.put(courseId, grade);
    }
}

