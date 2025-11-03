package se.lexicon.model;

import java.util.Arrays;

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
        sequencer++;
        return sequencer;
    }

   // public int getId() {
    //    return id;
    //}

   // public String getFirstName() {
    //    return firstName;
    //}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //public String getLastName() {
      //  return lastName;
   // }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //public Book[] getBorrowed() {
      //  return borrowed;
    //}

    public void setBorrowed(Book[] borrowed) {
        this.borrowed = borrowed;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrower(this);
            Book[] newBorrowed = Arrays.copyOf(borrowed, borrowed.length + 1);
            newBorrowed[newBorrowed.length - 1] = book;
            setBorrowed(newBorrowed);
        } else {
            System.out.println("Cannot loan book");
        }
    }
    public void returnBook(Book book){
        if (book == null) { throw new IllegalArgumentException("book cannot be null");}
        for (int i = 0; i < borrowed.length; i++) {
            if(borrowed[i] != null &&
               borrowed[i].getTitle().equalsIgnoreCase(book.getTitle())==
               borrowed[i].getAuthor().equalsIgnoreCase(book.getAuthor())){
               borrowed[i] = null;
                book.setAvailable(true);
                return;
            }



        }
    }
    public String getPersonInformation() {
        return "Person Id: " + id + ", Name: " + firstName + " " + lastName;
    }
}