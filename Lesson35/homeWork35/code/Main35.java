import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main35 {
    /*
    Task 1
    Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист,
    содержащий элементы Yes или No, где значения на i-м месте зависит от того,
    равны ли элементы этих двух листов под номером i.
        Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
    Протестировать
    Task 2
    Написать метод, принимающий лист целых чисел и целое число и возвращающий лист без элементов больших этого числа.
    Протестировать.
     */
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(8);

        System.out.println(list2);

        System.out.println(compareTwoLists(list1, list2));
        System.out.println(limitList(list2, 7));
    }

    public static List<String> compareTwoLists(List<Integer> arr1, List<Integer> arr2) {

        List<String> compareList = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i).equals(arr2.get(i))) {
                compareList.add("Yes");
            } else {
                compareList.add("No");
            }
        }
        return compareList;
    }

    public static List<Integer> limitList(List<Integer> list, Integer integer){
        List<Integer> limitList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= integer){
                limitList.add(list.get(i));
            }
        }
        return limitList;
    }
}
