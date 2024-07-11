/*
Шарыгина Надежда Б763-2
Вариант А
2.  Маленькая библиотека. Доступны для чтения несколько книг. Одинаковых
книг в библиотеке нет. Некоторые выдаются на руки, некоторые только
в читальный зал. Читатель может брать на руки и в читальный зал несколько книг. */

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Книга 1", true));
        library.addBook(new Book("Книга 2", false));
        library.addBook(new Book("Книга 3", true));
        Reader reader1 = new Reader("Алиса");
        Reader reader2 = new Reader("Кирилл");
        library.displayBooks();
        library.borrowBook(reader1, "Книга 1");
        library.borrowBook(reader2, "Книга 2");
        library.displayBooks();
        library.returnBook(reader1, "Книга 1");
        library.displayBooks();
    }
}