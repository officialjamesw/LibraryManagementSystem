import java.util.ArrayList;
import java.util.List;

//import ArrayList to hold all the Book in the library

public class Library {
    private List<Book> Book;
    private List<Member> member;
    private List<Loan> loans;

    //constructor
    public Library(){
        this.Book = new ArrayList<>(); //creates the ArrayList for Book when Library object is made
        this.member = new ArrayList<>(); //creates Arraylist for member when Library object is made
        this.loans = new ArrayList<>(); //creates ArrayList for loans
    }

    //method to add book to library
    public void addBook(Book book){
        this.Book.add(book);
    }

    //method to remove book from library
    public void removeBook(Book book){
        this.Book.remove(book);
    }

    //method to search book by title
    public Book searchBookByTitle(String title){
        for(Book book : Book){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book; //if the title is detected within the library
            }
        }
        return null;
    }

    //method to search all Book that a specific author has written contained in the library
    public Book searchBookByAuthor(String author){
        for(Book book : Book){
            if(book.getAuthor().equalsIgnoreCase(author)){
                return book;
            }
        }
        return null;
    }

    //method to add member to library
    public void addMember(Member member){
        this.member.add(member);
    }

    //method to remove member from library
    public void removeMember(Member member){
        this.member.remove(member);
    }

    public void addLoan(Loan loan){
        this.loans.add(loan);
    }

    public void removeLoan(Loan loan){
        this.loans.remove(loan);
    }


}
