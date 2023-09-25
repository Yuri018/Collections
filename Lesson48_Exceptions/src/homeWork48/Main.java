package homeWork48;

import java.util.*;

public class Main {
    /*
    Дан список строк вида:

    DE1613321892788;Jack Johnson
    DE1613324427567;Ivan Ivanov
    DE1612324427565;Ann Smith

    т.е. список банковских счетов с именем владельца. К сожалению, список пришел некорректный:
        у некоторых счетов отсутствуют имена владельцев,
        некоторые счета не начинаются на DE или короче 15 символов.
    Ваш метод должен сформировать список объектов типа Account (String iban, Person owner),
    ЕСЛИ ВСЕ ЗАПИСИ корректны, либо выкинуть exception.
    Причем в последнем случае, должна быть сохранена информация о том, какие строки и какие проблемы содержали.(попробовать getCause(), getMessage())
     */
    public static void main(String[] args) {
        List<String> list = List.of(
                "wE16133218g278800;Jack Johnson",
                "DE1613324427567;Ivan Ivanov",
                "DE1612324427565;Ann Smith");

        List<Account> accounts = new ArrayList<>();

        for (String str: list){
            try {
                accounts.add(createAccount(str));
            } catch (AccountCreateException e) {
                System.out.println("---  " + str);
                System.out.println(e.getErrorList());
            }
        }
        System.out.println(accounts);
    }

    public static Account createAccount(String str) throws AccountCreateException {
        List<String> errors = new ArrayList<>();
        AccountCreateException exception = new AccountCreateException(errors);
        String[] strSplit = str.split(";");

//        List<String> list = lineSplitting(str);


            if (!strSplit[0].startsWith("DE")) {
                errors.add("The account does not start on DE");
            }
            if (!isNumbersOnly(strSplit[0].substring(2))) {
                errors.add("Use only numbers in the invoice");
            }
            if (strSplit[0].length() != 15) {
                errors.add("The length of the count must be 15 characters");
            }
            if (strSplit[1].isEmpty()){
                errors.add("It is necessary to fill in the Name and Surname");
            }

        if (!errors.isEmpty()) throw exception;
        return new Account(strSplit[0], checkName(strSplit[1]));
    }

//    public static List<String> lineSplitting(String str){
//        List<String> list = new ArrayList<>();
//        list.add(Arrays.toString(str.split(";")));
//       return list;
//    }

    private static boolean isNumbersOnly(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private static Person checkName(String str){
        String[] splitString = str.split(" ");

        if (splitString[0] == null && splitString[1] == null){
            return null;
        } else
            return new Person(splitString[0], splitString[1]);
    }
}
