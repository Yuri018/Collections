package homeWork63.warargs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Violin {
    private String name;
    LocalDate productionDate;

    public Violin(String name, String date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.name = name;
        this.productionDate = LocalDate.parse(date, dateFormatter);
    }

    public String getName() {
        return name;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "name='" + name + '\'' +
                ", date=" + productionDate +
                '}';
    }
}
