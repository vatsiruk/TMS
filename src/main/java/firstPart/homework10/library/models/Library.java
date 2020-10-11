package firstPart.homework10.library.models;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> booksList = new ArrayList<>();

    public void addBook(Book book) {
        for (Book currentBook : booksList) {
            if (currentBook.getId() == book.getId()) {
                System.out.println("Книга с таким id уже существует.");
                return;
            }
        }

        booksList.add(book);

    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void removeBook(int id) {
        for (Book book : booksList) {
            if (book.getId() == id) {
                booksList.remove(book);
                return;
            }
        }
    }

    public void editBook(int id, String newTitle, String newGenre) {
        for (Book book : booksList) {
            if (book.getId() == id) {
                book.setTitle(newTitle);
                book.setGenre(newGenre);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "booksList=" + booksList +
                '}';
    }
}
