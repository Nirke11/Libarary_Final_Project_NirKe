package Library_Final_Project;

public class Book {
    private String author;
    private String title;
    private int numOfPages;

    public Book(String author, String title, int numOfPages) {
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return "שם הספר: " + title + ", מחבר: " + author + ", מספר עמודים: " + numOfPages;
    }
}
