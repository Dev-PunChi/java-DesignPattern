package Bridge;

public class Draft {
    private String title;
    private String author;
    private String[] content;

    public Draft(String title, String author, String[] content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void print(Display display) {
        display.title(this);
        display.author(this);
        display.content(this);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String[] content) {
        this.content = content;
    }
}
