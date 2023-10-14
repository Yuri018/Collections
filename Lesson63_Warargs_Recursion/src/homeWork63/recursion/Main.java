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
    }
    public static void recursivePrint(int num){
        if (num > 0){
            recursivePrint(num - 1);
            System.out.print(num + " ");
        }
    }
}
