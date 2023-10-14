package homeWork63.warargs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Violin {
    private String name;
    LocalDate date;

    public Violin(String name, String date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy");
        this.name = name;
        this.date = LocalDate.parse(date, dateFormatter);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
