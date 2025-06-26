import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libeary library = new Libeary();

        library.addBook(new Book("The Solo Level", "Chu gong"));
        library.addBook(new Book("1984", "George Orwell"));

        User user = new User("Sachin");
        library.registerUser(user);

        library.listBooks();

        library.issueBook("1984", "Sachin");
        library.listBooks();

        library.returnBook("Sachin");
        library.listBooks();
    }
}