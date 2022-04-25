public class Book {
    private String name;
    private Person autor;
    private int yearPublished;

    Book(String name, Person autor, int yearPublished) {
        this.name = name;
        this.autor = autor;
        this.yearPublished = yearPublished;
    }

    public int getAge() {
        return 2016 - this.yearPublished;
    }

    public String getInfo() {
        String firstName = this.autor.getFirstName();
        String lastName = this.autor.getLastName();

        return firstName + lastName;
    }

    public String getBookName() {
        return this.name;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public Person getBookAutor() {
        return this.autor;
    }

    public void setBookName(String name) {
        this.name = name;
    }

    public void setAutor(Person autor) {
        this.autor = autor;
    }
    public void setYearPublished(int year) {
        this.yearPublished = year;
    }

    public static void main(String[] args) {
        Person autor = new Person("JK", "Rowling");
        System.out.println("Author: " + autor.getFirstName());
        // Book book = new Book("Harry Potter", autor, 1995);

        // System.out.println(book.getBookName());
    }
}
