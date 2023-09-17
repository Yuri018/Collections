package homeWork43;

import java.util.*;

public class MostWords {
    public static void main(String[] args) {
        /*
        Дан List, каждая строка которого содержит текст (слова разделены пробелом, без знаков препинания).
        Необходимо получить N самых часто встречающихся слов
         */
        String text = "hashCode method is used to get the hash code of an object " +
                "hashCode method of the object class returns the memory reference of an object in integer form " +
                "Definition of hashCode method is public native hashCode It indicates the implementation " +
                "of hashCode is native because there is not any direct method in java to fetch the reference " +
                "of the object It is possible to provide your implementation of hashCode" +
                "In HashMap hashCode is used to calculate the bucket and therefore calculate the index";

        List<String> words = listStrings(text);
        System.out.println(words);

        for (Map.Entry<String, List<Integer>> entry : sortedMapByValue(mostWords(listStrings(text))).entrySet()) {
            System.out.println("\"" + entry.getKey() + "\"" + ", Quantity in the text " + entry.getValue());
        }
    }

    public static List<String> listStrings(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(str.split(" "));
    }

    public static Map<String, List<Integer>> mostWords(Collection<String> collection) {
        Map<String, List<Integer>> map = new HashMap<>();
        if (collection == null) return null;
        for (String s : collection) {
            List<Integer> value = map.getOrDefault(s, new ArrayList<>());
            value.add(value.size() + 1);
            map.put(s, value);
        }
        return map;
    }

    public static Map<String, List<Integer>> sortedMapByValue(Map<String, List<Integer>> map) {
        List<Map.Entry<String, List<Integer>>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, List<Integer>>>() {
            public int compare(Map.Entry<String, List<Integer>> o1, Map.Entry<String, List<Integer>> o2) {
                int sum1 = 0;
                for (int num : o1.getValue()) {
                    sum1 += num;
                }
                int sum2 = 0;
                for (int num : o2.getValue()) {
                    sum2 += num;
                }
                return sum2 - sum1;
            }
        });
        Map<String, List<Integer>> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Integer>> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
