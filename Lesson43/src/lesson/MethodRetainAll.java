package lesson;

import java.util.*;

public class MethodRetainAll {
    public static void main(String[] args) {
        /*
        Дано два списка User. Реализовать метод List<String> findDuplicates(Collection<User> collA,Collection<User> collB) который вернет лист дубликатов
         */

        List<String> list1 = List.of("1", "2", "8", "5");
        List<String> list2 = List.of( "2", "5", "6");

        System.out.println(findDuplicates(list1, list2));

    }

    public static List<String> findDuplicates(Collection<String> collA, Collection<String> collB){
        Set<String> setA = new HashSet<>(collA);
        Set<String> setB = new HashSet<>(collB);
        setA.retainAll(setB);
        return new ArrayList<>(setA);
    }

    public static List<String> findDuplicates1(Collection<String> collA, Collection<String> collB){
        Set<String> setA = new HashSet<>(collA);
        Set<String> setB = new HashSet<>(collB);
        ArrayList<String> res = new ArrayList<>();
        for (String str: setA){
            if(setB.contains(str)){
                res.add(str);
            }
        }
        return res;
    }
}
