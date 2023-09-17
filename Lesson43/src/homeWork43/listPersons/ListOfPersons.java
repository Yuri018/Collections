package homeWork43.listPersons;

import java.util.*;

public class ListOfPersons {
    public static void main(String[] args) {
        /*
        Дан Map<Integer, List> - ключ возраст, значение список имен людей этого возраста.
        Необходимо получить список объектов Person{String name, int age}
         */

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 25));
        personList.add(new Person("Jack", 28));
        personList.add(new Person("Johnson", 32));
        personList.add(new Person("Joplin", 25));
        personList.add(new Person("Johshua", 28));

        System.out.println(addListToMap(personList));
        printListPersons(addListToMap(personList));

    }

    public static Map<Integer, List<String>> addListToMap(List<Person> list) {
        Map<Integer, List<String>> addListToMap = new HashMap<>();
        if (list == null) return addListToMap;

        for (Person person : list) {
            int key = person.getAge();
            List<String> value = addListToMap.getOrDefault(key, new ArrayList<>());
            value.add(person.getName());

            addListToMap.put(key, value);
        }
        return addListToMap;
    }

    public static void printListPersons(Map<Integer, List<String>> map) {

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println("Age " + entry.getKey() + ", Name " + entry.getValue());
        }
    }
}

