package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        System.out.println(build());
        // Create a book instance
        // Display book information

        // Create a person instance
        // Display person information

        // Loan a book to the person

        // Display person information after borrowing a book
        // Display book information after borrowing a book

        // Return the borrowed book

        // Display person information after returning the book
        // Display book information after borrowing a book
    }
    public static String build(){
        StringBuilder info = new StringBuilder();
// Create a book instance
        Book book = new Book("Software Developer", "Lexicon Växjö");
        Book book1 = new Book("Java group 58", "Elnaz azizi");

        // Display book information
        info.append("\n>Display Book Information: <\n\n");
        info.append(book.getBookInformation()).append("\n");
        info.append(book1.getBookInformation()).append("\n\n");

        // Create a person instance
        Person person = new Person("Jan","Andersson");
        Person person1 = new Person("Erik", "Andersson");

        // Display person information
        info.append(">Display Person Information: <\n\n");
        info.append(person.getPersonInformation()).append("\n");
        info.append(person1.getPersonInformation()).append("\n\n");

        // Loan a book to the person
        person.loanBook(book);
        person1.loanBook(book1);

        // Display person information after borrowing a book
        info.append(">Display Person information after borrowing a book: <\n\n");
        info.append(person.getPersonInformation()).append("\nBorrowed book:").append(book.getBookInformation()).append("\n\n");
        info.append(person1.getPersonInformation()).append("\nBorrowed book:").append(book1.getBookInformation()).append("\n\n");
        // Display book information after borrowing a book

        // Return the borrowed book
        person.returnBook(book);
        person1.returnBook(book1);

        // Display person information after returning the book
        // Display book information after borrowing a book
        info.append(">Display person information after book return and display book information after borrowing: <\n\n");
        info.append("Return information: ").append(person.getPersonInformation()).append("\n");
        info.append("Book information: ").append(book.getBookInformation()).append("\n\n");
        info.append("Return information: ").append(person1.getPersonInformation()).append("\n");
        info.append("Book information: ").append(book1.getBookInformation()).append("\n\n");

        return info.toString();
    }

}
