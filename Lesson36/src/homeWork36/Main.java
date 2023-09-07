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

        System.out.println("min element in the list - " + Homework.minStringInList(listStr));
        System.out.println("max element in the list - " + Homework.maxStringInList(listStr));
    }

}
