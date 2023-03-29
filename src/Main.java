public class Main {
    public static void main(String[] args) {
        Book Book = new Book("Федор Достоевский ", "Война и мир ", 1856);
        System.out.println("Книга  = " + Book.getBoocName());
        System.out.println("Автор = " + Book.getAuthor());
        System.out.println("Год издания = " + Book.getPublishingYear());
        Book.setAuthor("Дж.К. Роулинг ");
        // Вызвали сеттер и создадим ноую книгу тут же за счет сеттера.
        System.out.println("Автор  = " + Book.getAuthor());
        Book.setBookName("Гарри Поттер ");
        // Создали новую книгу Гарри Поттер
        System.out.println("Название книги = " + Book.getBoocName());
        Book.setPublishingYear(1997);
        // Создали с помощью Сеттера новый годвыпуска книги
        System.out.println("Год  издания книги = " + Book.getPublishingYear());
    }
}