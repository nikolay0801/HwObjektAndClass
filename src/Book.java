public class Book {
    private String authorName;
    private String bookName;
    int publishingYear;

    public Book(String authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAutorName() {
        return this.authorName; // вернули значение автору
    }

    public String getBoocName() {
        return this.bookName; /// вернул  значение названию книги
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName; // присвоил новое значение
        // Вывели в консоль с помощью soutv. Book.getAuthorName
        // повторили все действия та же с гожом выпуска и нзванием книги
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
