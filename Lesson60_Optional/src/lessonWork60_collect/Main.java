package lessonWork60_collect;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "mango", "lime", "lime");

        //собираем в лист
        List<String> fruitsCapital = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // можно заменить на сокращенную версию

        // собираем в сет
        Set<String> fruitsSet = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(fruitsSet);

        //собрать в конкретную структуру
        LinkedList<String> collectToCollection = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(LinkedList::new));

        // counting method
        Long collectCounting = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.counting()); // можно заменить на сокращенную версию

        // собираем в Мар (ключ/значение)
        Map<String, Integer> collectToMap = fruits.stream()
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toMap(Function.identity(), string -> string.length()));

        System.out.println(collectToMap);
    }
}
