package lessonWork60_Optional;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of(
                "orange", "apple", "banana", "mango", "kiwi"
        );
        
        //

        Optional<String> kiwiOptional = fruits.stream()
                .filter(s -> s.length() < 5)
                .findFirst();

        String fruit = kiwiOptional.get();
        System.out.println(fruit);
    }

}
