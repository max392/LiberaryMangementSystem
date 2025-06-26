public class Book {
    private String title;
    private String aurthor;
    private boolean isIssued;
    public Book(String title,String aurthor){
        this.title=title;
        this.aurthor= aurthor;
        this.isIssued= false;
    }
    public String getTitle(){
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }
    public void issue(){
        this.isIssued=true;
    }
    public void returnBook(){
        this.isIssued= false;
    }
    @Override
    public String toString(){
        return title + " by " + aurthor + (isIssued ? " [Issued]" : " [Available]");

    }
}
