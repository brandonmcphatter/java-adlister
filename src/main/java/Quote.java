import java.io.Serializable;

public class Quote implements Serializable {
    private int id;
    private String content;
    private Author author;


    public Quote() {
    }

    public Quote(int id, Author author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author=" + author +
                ", content='" + content + '\'' +
                '}';
    }
}
