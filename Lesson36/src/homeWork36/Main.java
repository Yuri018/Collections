package homeWork36;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Task 1
        Написать метод, принимающий не пустой лист строк и возвращающий строку,
        которая встречается раньше в листе - самую короткую или самую длинную.
        Все строки в листе разной длины
         */

        List<String> listStr = new ArrayList<>();
        listStr.add("three");
        listStr.add("one");
        listStr.add("nine");
        listStr.add("twenty seven");
        listStr.add("one");
        listStr.add("eleven");
        listStr.add("thirteen");
        System.out.println(listStr);

        System.out.println("min element in the list - " + HOmeWork36.minStringInList(listStr));
        System.out.println("max element in the list - " + HOmeWork36.maxStringInList(listStr));
//        System.out.println(HOmeWork36.test(listStr));
    }
//    public static String minStringInList(List<String> list){
//        String minString = Collections.min(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        return minString;
//    }
//
//    public static String maxStringInList(List<String> list){
//        String maxString = Collections.max(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        return maxString;
//    }
//
//    public static String test(List<String> list){
//        String minSize = list.get(0);
//        int indexMin = 0;
//
//        String maxSize = list.get(0);
//        int indexMax = 0;
//
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).length() < minSize.length()){
//                minSize = list.get(i);
//                indexMin = i;
//            } else if (list.get(i).length() > maxSize.length()) {
//                maxSize = list.get(i);
//                indexMax = i;
//            }
//        }
//        if (indexMin < indexMax){
//            return minSize;
//        } else
//            return maxSize;
//    }
}
