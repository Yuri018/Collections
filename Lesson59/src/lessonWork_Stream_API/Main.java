package lessonWork_Stream_API;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Foreach
        //method reference - ссылка на метод

        List<Panda> pandas = List.of(
                new Panda("Po", 60_000),
                new Panda("Boo", 65_000),
                new Panda("Small Jay", 40_000)
        );
        //надо изменять исходные значения - мутировать
        //method reference: ClassName::methodName
        pandas.forEach(Panda::eatBamboo);
        System.out.println(pandas);

        //***********************************************************

        //reduce - сведение к какому-то значению
        double totalWeight = pandas.stream()
                .map(Panda::getWeight)
                .reduce(0.0, Double::sum);
        System.out.println(totalWeight);

        //***********************************************************

        //limit - возвращает указанное количество элементов начиная с первого

        List<String> animals = List.of("Panda", "Lion", "Giraffe", "Monkey", "Rat");
        List<String> listLimit = animals.stream().limit(2).toList();
        System.out.println(listLimit);

        //***********************************************************

        //skip - указанное количество элементов пропускается

        List<String> listSkip = animals.stream().skip(3).toList();
        System.out.println(listSkip);

        //***********************************************************

        //distinct - оставляет только уникальные элементы

        List<String> listDistinct = animals.stream().distinct().toList();
        System.out.println(listDistinct);

        //***********************************************************

        //sorted - сортировка
        //сортируем по количеству букв
        List<String> listSorted = animals.stream().sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .toList();
        System.out.println(listSorted);

        //***********************************************************

        //findAny


        //***********************************************************
        //anyMatch - проверяет есть ли элемент, удовлетворяющий условию
        boolean anyMatch = animals.stream()
                .anyMatch(a -> a.equals("Panda"));
        System.out.println(anyMatch);

    }
}
