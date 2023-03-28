
    public class Person {
        // Создали новый класс Person (Личность)
       private String name; // можно использовать только в классе Person.
        // Объявили свойство name (имени)
       private int age;
        // Объявили свойство age (возраста)
        public Person(String name, int age) {
            this.name= name;
            this.age= age;
        }
        public String getName(){
            // Возвращаем значение свойство через метод get.
            return this.name;
            // this - этот. Return - возвращение.
        }

        public int getAge() {
            return this.age;
        }
        public void setAge( int age){
            // Добавлем значение сойства с помощью метода set.
            this.age = age;
        }
    }
