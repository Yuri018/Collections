import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        Set<String> set1 = new HashSet<>(str);//можно передать лист в сет, чтобы оставить только уникальные элементы
        set1.add("str1");
        set1.add("str2");
        set1.add("str3");
        set1.add("str4");
        System.out.println(set1);
        System.out.println(set1.contains("str4"));
    }
}
