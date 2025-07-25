public class Content {
    private String title;
    private String body;

    public Content(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void display() {
        System.out.println("Title: " + title + "\nContent: " + body);
    }
}

