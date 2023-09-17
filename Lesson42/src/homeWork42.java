import java.util.*;

public class homeWork42 {
    /*
    Дана String с произвольным текстом (без знаков препинания слова разделены пробелом).
    Необходимо получить map, где ключем будет выступать первая буква слова,
    а значением, список слов начинающихся на эту букву.
     */

    public static void main(String[] args) {

        String text = "hashCode method is used to get the hash code of an object " +
                "hashCode method of the object class returns the memory reference of an object in integer form " +
                "Definition of hashCode method is public native hashCode It indicates the implementation " +
                "of hashCode is native because there is not any direct method in java to fetch the reference " +
                "of the object It is possible to provide your implementation of hashCode" +
                "In HashMap hashCode is used to calculate the bucket and therefore calculate the index";

        for (Map.Entry<String, List<String>> entry : listOfWords(text).entrySet()) {
            System.out.println("Key " + entry.getKey() + ", words " + entry.getValue());
        }
    }

    public static Map<String, List<String>> listOfWords(String string) {
        Map<String, List<String>> listOfWords = new TreeMap<>();

        String[] words = string.split(" ");

        for (String word : words) {
            String key = String.valueOf(word.charAt(0));
            List<String> value = listOfWords.getOrDefault(key, new ArrayList<>());
            value.add(word);
            listOfWords.put(key, value);
        }
        return listOfWords;
    }


}
