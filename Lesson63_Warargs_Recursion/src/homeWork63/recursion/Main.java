package homeWork63.recursion;

public class Main {
    /*
    Задание 1 рекурсия
    Дано натуральное число n. Выведите все числа от 1 до n.
    Иными словами, метод должен принимать натуральное число и выводить числа от 1 до это числа.
    Например, для параметра 6 -> выведет 1 2 3 4 5 6
     */
    public static void main(String[] args) {

        recursivePrint(6);
        System.out.println();

        System.out.println(palindrom("apipa"));
        System.out.println(palindrom("pip"));
        System.out.println(palindrom("i"));
        System.out.println(palindrom("aripa"));
    }
    public static void recursivePrint(int num){
        if (num > 0){
            recursivePrint(num - 1);
            System.out.print(num + " ");
        }
    }
    public static String palindrom(String word){
        // базовый случай
        if (word.isEmpty() || word.length() == 1){
            return "yes";
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)){
            // если совпали
            return palindrom(word.substring(1, word.length() - 1));
        } else {
            return "no";
        }
    }
}
