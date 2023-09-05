import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Конструкторы ArrayList:

    ArrayList() - создает пустой лист
    ArrayList(Collection collection) - создается лист, в который добавляются все элементы collection
    ArrayList(int capacity) - список с начальный размером capacity
     */
    public static void main(String[] args) {

        //варианты создания
//        ArrayList<String> names = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<Integer> ints = new ArrayList<>(20);

        //добавление элемента в коней List - add();
        name.add("John");
        name.add("Bill");
        System.out.println(name);

        //добавление по индексу
        name.add(1, "Mary");
        System.out.println(name);

//        ints.add(3, 5);// так будет ошибка добавления, т.к. лист пустой
//        System.out.println(ints);

        //метод определения количества элементов листа
        System.out.println(name.size());
        System.out.println(ints.size());

        //изменение элемента List
        name.set(1, "Max");
        System.out.println(name);

        //получить элемент из List
        String test = name.get(2);
        System.out.println(test);
        System.out.println("at the last position - " + name.get(name.size() - 1));

        //удаление элементов. Метод remove(Object o) and remove(int index)
        name.remove("Bill");
        System.out.println(name);
        System.out.println("Wo ist remove - " + name.remove(0));

        // indexOf(Object o) - возвращает индекс элемента
        System.out.println(name.indexOf("John"));
        name.add("Ann");
        name.add("John");
        System.out.println(name);

        //Collections.sort() - сортировка
        Collections.sort(name);
        System.out.println(name);

        // перебор коллекции
        for (String string : name){
            System.out.println(string);
        }

        //Итератор - возвращает обьект, реализующий интерфейс Iterator
        //methods Iterator
        //E - next() - возвращает следующий элемент
        //boolean hasNext() - проверяет, достигнут ли коней коллекции
        //remove() - удаляет последний элемент полученный вызовом next()

        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()){

            if (iterator.next().equals("Ann")){
                iterator.remove();
            }
        }
        System.out.println(name);
    }
}
