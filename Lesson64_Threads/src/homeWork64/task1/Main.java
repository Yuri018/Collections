package homeWork64.task1;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    /*
    Сегодня возраст нашего героя - 50 лет, сколько лет ему было в 2007
     */
    public static void main(String[] args) {
        int age = 50;
        LocalDate date = LocalDate.of(2007, 5, 10);

        LocalDate birthday = LocalDate.now().minusYears(age);
        Period period = Period.between(birthday, date);
        System.out.println("In the year " + date.getYear() + ", our hero was " + period.getYears() + " years old");
    }
}