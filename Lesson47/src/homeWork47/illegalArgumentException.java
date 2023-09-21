package homeWork47;

public class illegalArgumentException {
    /*
    Написать метод, который получает в качестве параметра строку длиной 16 символов и,
    если строка не соответствует этому требованию выбрасывает IllegalArgumentException
     */
    public static void main(String[] args) {
        String characters16 = "asdfghjklzxcvbnd";
        testException(characters16);
    }

    public static void testException(String str) {
        if (str.length() != 16) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(str);
        }
    }
}
