import java.lang.reflect.Member;
import java.util.Date;

public class Loan {

    private Date issueDate;
    private Book book;
    private Member member;

    public Loan(Book book, Member member){
        this.book = book;
        this.member = member;
        this.issueDate = new Date();
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Member getMember(){
        return member;
    }

    public Book getBook(){
        return book;
    }
}
