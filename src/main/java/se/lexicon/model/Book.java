package se.lexicon.model;

public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;
    private static int seq = 0;


    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        this.available = true;
        this.borrower = null;
        this.id = "book " +(++seq);
    }

    public Book(String title, String author, boolean available) {
        setTitle(title);
        setAuthor(author);
        setAvailable(true);
        /*setBorrower(borrower);*/

    }

   public static int getSeq() {
        seq++;
        return seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //public Person getBorrower() {
      //  return borrower;
    //}

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
       // this.available =(borrower == null);
    }

    public String getBookInformation() {
        return "Id: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + available;
    }
}