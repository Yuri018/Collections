package homeWork45;

import java.util.*;

public class Main45 {
    public static void main(String[] args) {
        /*
        Дана строка - скобочная последовательность ( строка состоящая из скобок трех видов *() [] {} )
        Написать метод (алгоритм обсуждали в классе) который проверит правильность расстановки скобок.

        ( {} [] ) -> true

        ( {} [ ) -> false

        ( } [] ) -> false

        { ( } [] ) -> false
         */

        String sequence = "{ ( } [] )";

        List<String> listStr = List.of(sequence.split(""));
        System.out.println(listStr);
        System.out.println(findingAMatch(listStr));
    }

    public static boolean findingAMatch (Collection<String> collection){
        Deque<String> stack = new ArrayDeque<>();
        if (collection == null){
            return false;
        }
        for (String s : collection){
            if (s.equals("(") || s.equals("{") || s.equals("[")){
                stack.push(s);
            }
            if (s.equals(")") || s.equals("}") || s.equals("]")){
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
