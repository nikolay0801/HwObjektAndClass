public class Book {
    private String bookName;
   private int publishingYear;
   private String author;


    public Book(String author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return this.author; // вернули значение автору
    }

    public String getBoocName() {
        return this.bookName; /// вернул  значение названию книги
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setBookName( String bookName){
        this.bookName = bookName;
    }
}
