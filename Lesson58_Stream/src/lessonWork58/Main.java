package lessonWork58;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 6, 23, 1, -3, 0);

        list.stream()
                .map(integer -> String.valueOf(integer))
                .map(string -> string.length())
                .map(integer -> Integer.toBinaryString(integer))
                .forEach(string -> System.out.println(string));

        System.out.println("___________________________________________");
        List<String> list1 = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> Integer.toBinaryString(i))
                .toList();
        list1.forEach(s -> System.out.println(s));

        System.out.println("___________________________________________");

        List<Person> listPerson = List.of(

                new Person("Ivan", "Polyakov", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName1", "lName1", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName2", "lName2", "ivan2@gmail.com", "+2222",
                        new Address("124524", "Moscow", "Bolotnaya", "25-1")),
                new Person("Jack", "London", "jack@gmail.com", "+512412",
                        new Address("42151", "London", "Compton", "+24125412")));

        List<String> list2 = listPerson.stream()
                .map(p -> p.getfName() + " " + p.getlName())
                .toList();
        list2.forEach(s -> System.out.println(s));

        List<String> list3 = listPerson.stream()
                .map(p -> p.getPhone())
                .toList();
        list3.forEach(s -> System.out.println(s));

        Set<String> collect = listPerson.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
        System.out.println(collect);
        List<Address> list4 = listPerson.stream()
                .map(p -> p.getAddress())
                .toList();
//        list4.forEach(list4);


    }
}
