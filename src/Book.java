import java.util.Objects;

public class Book {
    private  String name;
    private int year;
    private Author author;


    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        this.name = name;
        return null; // Идея поставила на тот случай, если ниодно из условий не сработает.
        // т.е если мы поставил абриввиатуру Final перед String Name то идея не даст нам сдклать сеттер для данного условия.
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }
}

