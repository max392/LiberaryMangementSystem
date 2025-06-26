import java.util.*;

public class Libeary {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void issueBook(String bookTitle, String userName) {
        Book book = findBook(bookTitle);
        User user = findUser(userName);

        if (book == null || book.isIssued()) {
            System.out.println("Book not available.");
            return;
        }

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (user.hasBook()) {
            System.out.println(userName + " already has a book.");
            return;
        }

        book.issue();
        user.issueBook(book);
        System.out.println("Book issued successfully.");
    }

    public void returnBook(String userName) {
        User user = findUser(userName);

        if (user == null || !user.hasBook()) {
            System.out.println("No book to return.");
            return;
        }

        Book returnedBook = user.returnBook();
        returnedBook.returnBook();
        System.out.println("Book returned successfully.");
    }

    private Book findBook(String title) {
        for (Book book : books)
            if (book.getTitle().equalsIgnoreCase(title))
                return book;
        return null;
    }

    private User findUser(String name) {
        for (User user : users)
            if (user.getName().equalsIgnoreCase(name))
                return user;
        return null;
    }

    public void listBooks() {
        for (Book book : books)
            System.out.println(book);
    }
}

