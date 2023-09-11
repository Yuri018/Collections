package linkedlist_implementation.code;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OurLinkedList<Person> list = new OurLinkedList<>();
        Person p1 = new Person("Jack");
        list.append(p1);
        list.append(new Person("John"));

        System.out.println(list.get(1));

        list.set(new Person("Oleg"), 1);
        System.out.println(list.get(1));

        list.append(new Person("Max"));
        list.append(new Person("Mary"));
        list.append(new Person("Ann"));

        System.out.println("+++++++++++++++++++++++++");
        list.printLinkedList();

        System.out.println("+++++++++++++++++++++++++");
        list.printLinkedList2();

        System.out.println("+++++++++++++++++++++++++");
        list.print();

        System.out.println("__________ iterator ___________");

        List<String> strList = new LinkedList<>();
        strList.add("str1");
        strList.add("str2");
        strList.add("str3");
        strList.add("str4");

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
        }

    }
}
