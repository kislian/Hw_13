package Hw;
import java.util.Objects;
public class Book {
    private String name;
    private int yearOfEdition;
    private Author author;

    public Book (String name, int yearOfEdition, Author author) {
        this.name = name;
        this.yearOfEdition = yearOfEdition;
        this.author = author;
    }
    public String getName() {

        return this.name;
    }
    public int getyearOfEdition() {

        return this.yearOfEdition;
    }
    public void setyearOfEdition(int yearOfEdition) {

        this.yearOfEdition = yearOfEdition;
    }
    public Author getAuthor (){
        return this.author;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return yearOfEdition == book.yearOfEdition && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return java.util.Objects.hash(name, yearOfEdition, author);
    }
    public String toString() {
        return "Название книги: " + this.name + ". Год издания: " + this.yearOfEdition + " " + this.author.toString();
    }
}
