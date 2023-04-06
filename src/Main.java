public class Main {
    public static void main(String[] args) {
        Author author = new Author("Федор ", "Достоевкий");
        Book book1 = new Book(" Война и мир", 1856, author);
        Book book2 = new Book(" Война и мир", 1868, author);
        System.out.println(book2.equals(book1));
    }
}