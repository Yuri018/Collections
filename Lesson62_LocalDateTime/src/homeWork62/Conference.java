package homeWork62;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Conference implements Comparable<Conference> {
    private String theme;
    private LocalDateTime time;
    private String link;

    private LocalDateTime localDateTime(String date, String time) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH-mm");
        LocalDate date1 = LocalDate.parse(date, dateFormatter);
        LocalTime time1 = LocalTime.parse(time, timeFormatter);
        return LocalDateTime.of(date1, time1);
    }

    public Conference(String theme, String date, String time, String link) {
        this.theme = theme;
        this.time = localDateTime(date, time);
        this.link = link;
    }

    public LocalDateTime getTime() {
        return time;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy hh:mm a");
        return "Theme - " + theme + ", time: " + formatter.format(time) + ", link - " + link + "\n";
    }

    @Override
    public int compareTo(Conference o) {
        return this.time.compareTo(o.getTime());
    }
}
