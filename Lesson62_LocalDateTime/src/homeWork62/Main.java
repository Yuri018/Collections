package homeWork62;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте класс Conference - с полями:

        тема String
        время LocalDateTime
        ссылка на приглашение String В конструкторе конференции нужно принимать отдельно две строки:
        date - в формате "dd-MM-yyyy",
        time - в формате "HH-mm"
        и остальную необходимую информацию
        Создайте лист конференций и отсортируйте их по возрастанию (от ближайших к тем которые только будут).
         */
        List<Conference> conferenceList = List.of(
                new Conference("Strings", "15-10-2023", "10-30", "www.link1.com"),
                new Conference("Integers", "16-11-2023", "12-00", "www.link2.com"),
                new Conference("ENUM", "20-12-2023", "14-30", "www.link3.com")
        );

        List<Conference> sortedConferencelist = conferenceList.stream()
                .sorted()
                .toList();

        System.out.println(sortedConferencelist);
        System.out.println(calculatePeriodBetweenDates("1990/04/10", "2000/10/26"));
    }

    /*
    Создайте метод, который принимает две даты LocalDate, а возвращает строку, сколько времени между ними пройдет.
    Например: "10 years, 2 months, 3 days"
    Используйте класс Period
     */

    public static String calculatePeriodBetweenDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dateOne = LocalDate.parse(date1, formatter);
        LocalDate dateTwo = LocalDate.parse(date2, formatter);
        Period period = Period.between(dateOne, dateTwo);

        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }
}
