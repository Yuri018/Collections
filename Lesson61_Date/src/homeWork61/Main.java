package homeWork61;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", "10.04.1990");
        Person person2 = new Person("John", "24.11.2002");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person2.compareTo(person1));
    }
}
