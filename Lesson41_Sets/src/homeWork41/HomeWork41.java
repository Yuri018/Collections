package homeWork41;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HomeWork41 {
    /*
    Дана Map<String, String>, если в ней есть ключ "a" и "b",
    то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
    Примеры: mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
     mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}
     */
    public static void main(String[] args) {
        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");

        Set<String> key = new HashSet<>();
        Set<String> value = new HashSet<>();

        Set<Map.Entry<String, String>> entriesMapAB = mapAB.entrySet();
        for (Map.Entry<String, String> entry : entriesMapAB){
            key.add(entry.getKey());
            value.add(entry.getValue());
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        mapAB.put(key.toString(), value.toString());

        Set<Map.Entry<String, String>> entriesMap1 = mapAB.entrySet();
        for (Map.Entry<String, String> entry : entriesMap1){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
