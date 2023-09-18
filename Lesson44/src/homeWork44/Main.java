package homeWork44;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Дан List<Integer>. Написать метод, который определит,
        есть ли в этом списке такая пара чисел, которые в сумме дают заданное число N.
         */

        List<Integer> numList = Arrays.asList(1, 3, 5, 4, 6, 9, 2);
        int n = 5;

        System.out.println("The sum of two values equal to " + n + " occurs " + findTwoNumbers(numList, n) + " times");
    }

    public static int findTwoNumbers(List<Integer> list, int n) {
        int count = 0;
        Set<Integer> temp = new HashSet<>();
        for (Integer num : list) {
            if (temp.contains(n - num)) {
                count++;
            }
            temp.add(num);
        }
        return count;
    }
}

