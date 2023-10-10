package homeWork60;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    /*
    Создайте класс товар Alcohol с полями:

    title - название
    strength - крепость алкоголя
    price
    Создайте лист из 6-7 товаров с разными значениями, пусть какое-нибудь одно значение дублируется/повторяется.
     */
    public static void main(String[] args) {

        List<Alcohol> alcoholList = List.of(
                new Alcohol("Bear", 5, 1.5),
                new Alcohol("Vine", 12, 4),
                new Alcohol("Champagne", 11, 3),
                new Alcohol("Bear", 5, 1.5),
                new Alcohol("Vodka", 40, 10),
                new Alcohol("Rom", 45, 15)
        );

        //Получите LinkedList из топ 3 самых дорогих товаров.
        LinkedList<Alcohol> threeExpensiveProducts = alcoholList.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
                .limit(3)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(threeExpensiveProducts);

        //Получите самый дешевый товар
        Optional<Alcohol> cheapestAlcohol = alcoholList.stream().min(Comparator.comparingDouble(Alcohol::getPrice));
//        List<Alcohol> cheapestProduct = cheapestAlcohol.stream().toList();
//        String string = cheapestAlcohol.toString();
        System.out.println(cheapestAlcohol.orElseGet(() -> new Alcohol("Water", 0, 0)));

        //Создайте Set из исходного листа.
        Set<Alcohol> collect = alcoholList.stream()
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(collect);

        //Создайте Map из исходного листа, в котором ключами будут - названия товаров, а значениями будут цены.
        Map<String, Double> alcoholListToMap = alcoholList.stream()
                .distinct()
                .collect(Collectors.toMap(Alcohol::getTitle, Alcohol::getPrice, (a, b) -> a));
        System.out.println(alcoholListToMap);

        //Создайте Map из исходного листа, в котором ключами будут - названия товаров, а значениям будет крепость.
        Map<String, Double> alcoholListToMap2 = alcoholList.stream()
                .distinct()
                .collect(Collectors.toMap(Alcohol::getTitle, Alcohol::getStrength, (a, b) -> b));
        System.out.println(alcoholListToMap2);

    }
}
