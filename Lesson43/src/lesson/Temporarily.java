package lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Temporarily {
    public static void main(String[] args) {
        /*
        Дано список строк List<String>. Получить список 4 самых часто встречаемых слов (без знаков препинания слова разделены пробелом)
            1. Список строк-текстов преобразовать в список слов
            2. Сформировать Map<String,Integer>
            3. Отсортировать сетд из Entry
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("qwe", 3);
        map.put("rty", 2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            // System.out.println(e.getKey() + " " +  e.getValue());
            System.out.println(e);
        }
        System.out.println(entries);
    }

}
