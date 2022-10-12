package hw;

import java.util.Objects;

public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle(){return this.title;}

    public Author getAuthor() {return this.author;}

    public int getPublicationYear() {return this.publicationYear;}

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;}

    public String toString() {
        return "Книга: " + this.title + " Автор: " + this.author + " Год публикации: " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

