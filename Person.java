public class Person {

    private String firstName;
    private String lastName;

    //constructior
    public Person(String firstName, String lastName) {
        System.out.println("Person constructor with parameters!");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //setter
    public void setFirstName(String name) {
        this.firstName = name;
    }

    //getter
    public String getFirstName() {
        return this.firstName;
    }

    //setter
    public void setLastName(String name) {
        this.lastName = name;
    }

    //getter
    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        String info = this.firstName + " " + this.lastName;
        return info;
    }
}