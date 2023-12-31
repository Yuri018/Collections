package homeWork46;

import java.util.*;

public class Optimization {
    /*
    Предствьте, у вас есть робот, которвй понимает команды:
    'С' - шаг на север
    'Ю' - шаг на юг
    'З' - шаг на запад
    'В' - шаг на восток
    Команды робату поступают в виде строки вида "CЗВЗЗТЮ". Очевидно, если в строке присутствуют рядом
    взаимопротиваположные команды например "ЗВ" или "СЮ" их можно сократить.
    Очевидно, что после сокращения, в строке опять взаимопротивоположные команды могут оказаться рядом,
    и их опять можно сократить.
    Например: "СВЮСЗ" превращается в "C" ( "СВЮСЗ" -> "СВЗ" -> "С" ). Напишите метод, который оптимизирует
    строку команд для робота, сокращая лишние шаги.

    Примеры: "NSNW" -> "NW"
    "NSEW" -> ""
    "NESW" -> "NESW"
    "NEWSESWNNS" -> "ESWN"
     */
    public static void main(String[] args) {

        String string = "NEWSESWNNS";

        System.out.println(stringToList(string));
        System.out.println(checkList(string));

    }

    public static List<Character> stringToList(String str) {
        List<Character> stringList = new ArrayList<>();
        for (Character ch : str.toCharArray()) {
            stringList.add(ch);
        }
        return stringList;
    }

    public static String checkList(String str) {

        if (str == null || str.isEmpty()){ return "";}

        Map<Character, Character> cardPoints = new HashMap<>();
        cardPoints.put('N', 'S');
        cardPoints.put('S', 'N');
        cardPoints.put('W', 'E');
        cardPoints.put('E', 'W');

        Deque<Character> stack = new LinkedList<>();
        for (Character ch : str.toCharArray()) {
           if (cardPoints.get(ch).equals(stack.peek())){
               stack.pop();
           } else {
               stack.push(ch);
           }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : stack){
            stringBuilder.append(ch);
        }
        return stringBuilder.reverse().toString();
    }
}
