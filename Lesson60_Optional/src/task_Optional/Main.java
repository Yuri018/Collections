package task_Optional;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("orange", 10),
                new Product("apple", 12),
                new Product("banana", 8),
                new Product("mango", 9),
                new Product("kiwi", 6)
        );

        System.out.println(getProductByTitle(products, "melon"));
    }
    public static Product getProductByTitle(List<Product> list, String title){
        Optional<Product> findMelon = list.stream()
                .filter(product -> product.getTitle().equals(title))
                .findFirst();

        return (findMelon.orElseGet(() -> new Product("doll", 15)));
    }
}

