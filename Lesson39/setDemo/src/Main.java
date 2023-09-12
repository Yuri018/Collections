import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();

        str.add("str1");
        str.add("str1");
        str.add("str1");
        str.add("str1");
        str.add("str1");
        str.add("str2");
        System.out.println(str);

        Set<String> set1 = new HashSet<>(str);//можно передать лист в сет, чтобы оставить только уникальные элементы

//        System.out.println(set1.contains("str4"));
        System.out.println("-----------------");
        System.out.println(set1);
        System.out.println("-----------------");
        List<String> str2 = new ArrayList<>(set1);
        System.out.println(str2);

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(getDuplicate(str));

    }
    //сделать метод вывода списка дублей из входящего листа
    public static Set<String> getDuplicate(List<String> list){
        Set<String> getDuplicate = new HashSet<>();
        Set<String> duple = new HashSet<>();
        for (String s : list){
            if (!getDuplicate.add(s)){
                duple.add(s);
            }
        }
        return duple;
    }

}
