package homeWork47.bankingProgram;

public class checkedExceptions {
    /*
    Представте, вы пишете банковскую программу. Создайте два checked exception: AccountFormatException и WrongAccountCountryCodeException.
    Напишите метод, который получает строку с номером вида: DE171271782891. Если строка короче 14 символов или длиннее 16
     - > AccountFormatException. Если строка не начинается с символов "DE" - WrongAccountCountryCodeException, если что-то другое
    (например передан null) -> IllegalArgumentException. При нормальном потоке выполнения, метод создает
    новый объект Account и возвращает его.
    Напишите вызов вашего метода с обработкой возможных исключений.
     */
    public static void main(String[] args) throws AccountFormatException, WrongAccountCountryCodeException {

        String accountNumber = "DE171271782891";

        System.out.println(createNewAccount(accountNumber));
    }

    public static Account createNewAccount(String accountNumber) throws AccountFormatException, WrongAccountCountryCodeException {
        Account account1 = new Account(accountNumber);
        if (checkNum(accountNumber)) {
            throw new IllegalArgumentException();
        }
        if (accountNumber.length() < 14 || accountNumber.length() > 16) {
            throw new AccountFormatException("Invalid number length");
        }
        if (accountNumber.charAt(0) != 'D' || accountNumber.charAt(1) != 'E') {
            throw new WrongAccountCountryCodeException();
        }
        if (!checkNumber(accountNumber)) {
            throw new NumberFormatException();
        }
        return account1;
    }

    private static boolean checkNumber(String str) {
        String subStr = str.substring(2);
        for (Character ch : subStr.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNum(String str) {
        if (!str.isEmpty()) {
            return false;
        }
        return true;
    }

}
