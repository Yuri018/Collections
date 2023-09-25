package homeWork50;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main50 {
    /*
    Давайте вспомним задачу про робота и его фиксированный набор команд (см.урок 46)
    Ваша задача реализовать класс робот. Естественно, в классе вы должны определить набор команд,
    которые понимает ваш робот (конечно, enum!).

        написать метод, который обрабатывает строку команд для робота, проверяя ее на ошибки и исключая такие команды.
        написать метод, который по строке команд выводит запись маршрута
        Например так: "СВЗ" -> "1. шаг на север 2. шаг на восток 3. шаг на запад"

        Примеры: "NSNW" -> "NW"
                 "NSEW" -> ""
                 "NESW" -> "NESW"
                 "NEWSESWNNS" -> "ESWN"
     */
    public static void main(String[] args) {

        String string = "NESW";

        System.out.println(commandProcessing(string));
        Robot robot = new Robot();
        robot.commandExecution(commandProcessing(string));

    }

    public static String commandProcessing(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        Map<Character, Character> cardPoints = new HashMap<>();
        cardPoints.put('N', 'S');
        cardPoints.put('S', 'N');
        cardPoints.put('W', 'E');
        cardPoints.put('E', 'W');

        Deque<Character> stack = new LinkedList<>();
        for (Character ch : str.toCharArray()) {
            if (cardPoints.get(ch).equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : stack) {
            stringBuilder.append(ch);
        }
        return stringBuilder.reverse().toString();
    }
}
