public class Book {
    private String title;
    private boolean forHome; // true если книгу можно взять домой, false если только в читальный зал
    public Book(String title, boolean forHome) {
        this.title = title;
        this.forHome = forHome;
    }
    public String getTitle() {
        return title;
    }
    public boolean isForHome() {
        return forHome;
    }
    @Override
    public String toString() {
        return title + " (Забрал(а) " + (forHome ? "домой" : "в читальный зал") + ")";
    }
}
