import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Library {
    private List<Book> books = new ArrayList<>();
    private Map<Book, Reader> issuedBooks = new HashMap<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void borrowBook(Reader reader, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !issuedBooks.containsKey(book)) {
                issuedBooks.put(book, reader);
                reader.borrowBook(book);
                books.remove(book);
                System.out.println(reader.getName() + " взял(а) " + book);
                return;
            }
        }
        System.out.println("Книга недоступна или уже взята.");
    }
    public void returnBook(Reader reader, String title) {
        for (Book book : reader.getBorrowedBooks()) {
            if (book.getTitle().equals(title)) {
                issuedBooks.remove(book);
                reader.returnBook(book);
                books.add(book);
                System.out.println(reader.getName() + " вернул(а) " + book);
                return;
            }
        }
        System.out.println("Книга не найдена в списке взятых.");
    }
    public void displayBooks() {
        System.out.println("Доступные книги в библиотеке:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}