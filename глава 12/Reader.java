import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();
    public Reader(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
