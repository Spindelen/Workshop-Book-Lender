package se.lexicon.model;

public class Person {
    // todo: needs completion
private static int sequencer = 0;
private final int id;
private String firstName;
private String lastName;
private Book[] borrowed = new Book[2];

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        this.id = getSequencer();
    }

    public static int getSequencer() {
        return ++sequencer;
    }

    public void setSequencer(int sequencer) {
        this.sequencer = sequencer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book[] getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Book[] borrowed) {
        this.borrowed = borrowed;
    }

    public void loanBook(Book book){
        if (book.isAvailable()){
            book.setBorrower(this);
            Book[] newBorrowed = Arrays.copyOf(borrowed, borrowed.length +1);
            newBorrowed[newBorrowed.length -1] =book;
            setBorrowed(newBorrowed);
        } else{
            System.out.println("Cannot loan book");
        }
    }
    public String getPersonInformation() {
        return "Person Id: " + id + ", Name: " + firstName + " " + lastName;
    }
}