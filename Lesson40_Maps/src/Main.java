import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
    Map - набор пар ключ\значение
    В качестве ключей могут быть разные типы данных.
    Ключи уникальны
     */
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1200, "Notebook");
        map.put(10, "Mouse");
        map.put(500, "TV");
        map.put(130, "Printer");

        System.out.println(map);

        map.put(10, "Clock");//добавляем другое значение с существующим ключом
        System.out.println(map);

        map.remove(10);//удаление значения по ключу
        System.out.println(map);

        System.out.println(map.get(130));//получение значения по ключу
        System.out.println(map.size());//размер Map

        System.out.println(map.containsKey(1200));//содержит ли значение: true
        System.out.println(map.containsKey(400));//или нет: false

        System.out.println(map.keySet());


    }
}
