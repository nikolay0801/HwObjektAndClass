public class Author {
    private final String firstName; // Если ставлбкласс автор то вылазит ошибка. 
    // не могу понять почему продит оштбка,если в коасса стоит Автор а не стринг(((

    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}