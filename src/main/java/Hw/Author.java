package Hw;
import java.util.Objects;

public class Author {
    private String nameOfAuthor;
    private String surnameOfAuthor;

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }
    //геттер для поля nameOfAuthor  поля имя автора
    public String getNameOfAuthor() {

        return this.nameOfAuthor;
    }
    //геттер для surnameOfAutho поля фамилия автора
    public String getSurnameOfAuthor() {

        return this.surnameOfAuthor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return Objects.equals(nameOfAuthor, author.nameOfAuthor) && Objects.equals(surnameOfAuthor, author.surnameOfAuthor);
    }

    public int hashCode() {
        return java.util.Objects.hash(nameOfAuthor, surnameOfAuthor);
    }
    public String toString() {
        return "Автор: " + this.nameOfAuthor + " " + this.surnameOfAuthor;
    }
}
