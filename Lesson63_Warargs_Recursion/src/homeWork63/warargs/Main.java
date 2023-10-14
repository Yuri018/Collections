package homeWork63.warargs;

public class Main {
    /*
    Создайте класс скрипка. Пусть у скрипки будут поля:

    String имя мастера, LocalDate дата производства Создайте в Майне метод, который должен принимать произвольное число скрипок и возвращать имя мастера самой старой скрипки из переданных. То есть метод должен бытия статическим и возвращать String.
     */
    public static void main(String[] args) {

        System.out.println(getNameOldViolinMaker(
                new Violin("Paganini", "1680"),
                new Violin("Stradivari", "1720"),
                new Violin("Amity", "1851")));

    }
    public static String getNameOldViolinMaker(Violin ...violins){
        String result = String.valueOf(violins[0].getName());
        for (int i = 0; i < violins.length; i++) {

        }

        return result;
    }
}
