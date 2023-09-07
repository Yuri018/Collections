package linkedLists;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        List<String> list = new LinkedList<>();

         /*
    LINKEDLIST
    конструкторы:
    LinkedList()  - пустой список
    LinkedList( Collection collection) -  список со всеми элементами коллекции
                collection
     */

        linkedList.add(35);
        linkedList.add(44);
        System.out.println(linkedList);

        linkedList.addFirst(87);//добавление в начало списка
        System.out.println(linkedList);

        linkedList.removeFirst();//удаляет первый элемент списка
        System.out.println(linkedList);

        System.out.println(linkedList.peekLast());//получение последнего элемента списка

    }
}
