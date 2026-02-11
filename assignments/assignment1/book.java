package assignments.assignment1;

public class book {

    //Fields
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    //Constructor
    public book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title == "") {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (title == null || title == "") {
            throw new IllegalArgumentException("Author cannot be empty");
        }
        this.author = author;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        if (isbn == null || isbn == "" || isbn.length() != 13) {
            throw new IllegalArgumentException("ISBN cannot be empty and must be 13 characters long");
        }
        this.isbn = isbn;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //display book info
    public void displayInfo() {
        System.out.println("");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Available: " + getAvailable());
        
    }
}
