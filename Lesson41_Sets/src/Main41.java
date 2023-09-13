import java.util.*;

public class Main41 {
    public static void main(String[] args) {
   // С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов

        System.out.println(task(List.of("John", "John", "Jack", "Ann")));

        System.out.println(task2(List.of(
                new Person("John", 21),
                new Person("John", 25),
                new Person("Jack", 44),
                new Person("Ann", 34))));
    }


    public static List<String> task(List<String> list){
        if (list == null){
            return null;
        }
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<Person> task2(List<Person> list){
        if (list == null){
            return null;
        }
        Set<Person> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
