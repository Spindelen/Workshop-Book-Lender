package se.lexicon.model;

public class Person {
    // todo: needs completion
private static int sequencer = 0;
private final int id;
private String firstName;
private String lastName;

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        this.id = getSequencer();
    }

    public int getSequencer() {
        return sequencer;
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
    public String getPersonInformation() {
        return "Person Id: " + id + ", Name: " + firstName + " " + lastName;
    }
}