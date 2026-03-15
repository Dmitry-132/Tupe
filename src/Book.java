
public class Book {
    private String title;
    private int publication;
    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.publication = year;
        this.author = author;
    }
    public String toString() {
        return "Book{" + "title'" + title + '\'' + ", publication = " + publication + ", author = " + author + '}';
    }
    public String getTitle() {
        return  this.title;
    }
    public int getPublication() {
        return  this.publication;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setPublication(int publication) {
        this.publication = publication;
    }
}
