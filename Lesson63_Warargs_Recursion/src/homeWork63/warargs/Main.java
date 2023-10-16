package homeWork63.warargs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /*
    Создайте класс скрипка. Пусть у скрипки будут поля:
    String имя мастера, LocalDate дата производства.
    Создайте в Майне метод, который должен принимать произвольное число скрипок
    и возвращать имя мастера самой старой скрипки из переданных.
    То есть метод должен быть статическим и возвращать String.
     */
    public static void main(String[] args) {

        System.out.println(getNameOldViolinMaker(
                new Violin("Paganini", "1680-10-23"),
                new Violin("Stradivari", "1720-04-12"),
                new Violin("Amity", "1851-12-12")));


    }
    public static String getNameOldViolinMaker(Violin ...violins){
//        String result ="";
//        String string = Arrays.stream(violins)
//                .sorted(Comparator.comparingInt(a -> (Integer.parseInt(String.valueOf(a.getProductionDate())))))
//                .toString();

        if (violins.length == 0){
            return null;
        }
        Violin oldViolin = violins[0];
        for (Violin violin: violins){
            if (oldViolin.getProductionDate().isAfter(violin.getProductionDate())){
                oldViolin = violin;
            }
        }

        return oldViolin.getName();
    }
}
