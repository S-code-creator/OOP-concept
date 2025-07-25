import java.util.*;

public class Course {
    private String id;
    private String title;

    public Course(String id, String title, Instructor instructor) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public List<Content> getContents() {
        return contents;
    }

    public String getTitle() {
        return title;
    }
}

