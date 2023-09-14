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
        for (Map.Entry<String, String> entry : entriesMapAB) {
            key.add(entry.getKey());
            value.add(entry.getValue());
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        mapAB.put(key.toString(), value.toString());

        Set<String> keysMap1 = mapAB.keySet();
        for (String keys : keysMap1) {
            System.out.println(keys + " " + mapAB.get(keys));
        }

//        Set<Map.Entry<String, String>> entriesMap1 = mapAB.entrySet();
//        for (Map.Entry<String, String> entry : entriesMap1){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        mapHandler(mapAB, "a", "b");
        System.out.println(mapAB);
    }

    public static void mapHandler(Map<String, String> map, String key1, String key2){
        if (map != null && map.containsKey("a") && map.containsKey("b")){
            map.put(key1 + key2, map.get(key1) + map.get(key2));
        }
    }
}
