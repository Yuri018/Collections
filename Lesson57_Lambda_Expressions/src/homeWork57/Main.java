package homeWork57;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    /*
    В программе задан список Person{ String fName, String lName, String email, String phone, Address address}.
    Класс адрес в Person это:  Address{String postcode, String city, String street, String house}
Реализовать следующие функции:
   	                   	-получить список всех ФИО
           	   	    	-получить список всех e-mail
   	                   	-получить список всех телефонов
   	                   	-получить список всех адресов в виде строки адреса
Естественно, все вышеперечисленные функции может и должен реализовать один метод,
в который в качестве параметра должен приходить список Person и реализация необходимого способа обработки.

     */
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("John", "Smith", "john@gmx.de", "015111111",
                new Address("100000", "Berlin", "Hauptstrasse", "12")));

        List<String> handler = handler(list, p -> p.getfName() + " " + p.getlName(), person -> true);
        System.out.println(handler);

    }

    public static List<String> handler(List<Person> list, Function<Person, String> function, Predicate<Person> predicate){
        List<String> res = new ArrayList<>();
        for (Person p: list){
            String apply = function.apply(p);
            res.add(apply);
        }
        return res;
    }

}
