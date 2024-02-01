import java.lang.reflect.Member;

public class Book {
    //attributes
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private String description;
    private double rating;
    private double price;
    private boolean available;
    private Loan currentLoan;   // Reference to the active loan

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice(){
        return price;
    }

    public double getRating(){
        return rating;
    }

    public String getGenre(){
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }
    //methods
    public boolean isAvailable(){
        return available;
    }

    public void loanBook(Member member) {
        if (available) {
            available = false;  // Set availability to false when the book is loaned
            currentLoan = new Loan(this, member);
        } else {
            System.out.println("Error: The book is already on loan.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;  // Set availability to true when the book is returned
            currentLoan = null;  // Clear the reference to the active loan
        } else {
            System.out.println("Error: The book is already available.");
        }
    }



}

