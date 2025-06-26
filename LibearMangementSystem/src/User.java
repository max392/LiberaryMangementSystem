public class User {
    private String name;
    private Book issuedBook;
    public User(String name){
        this.name= name;
    }
    public boolean hasBook(){
        return issuedBook!=null;
    }
    public void issueBook(Book book){
        this.issuedBook=book;
    }
    public Book returnBook(){
        Book returned = issuedBook;
        issuedBook = null;
        return returned;
    }
    public String getName(){
        return name;
    }


}
