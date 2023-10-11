package homeWork61;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{
    private String name;
    private Date dateOfBirth;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public Person(String name, String dateOfBirth) {
        this.name = name;
        try {
            this.dateOfBirth = dateFormat.parse(dateOfBirth);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return dateOfBirth;
    }
    public void setDate(Date date) {
        this.dateOfBirth = date;
    }

    @Override
    public int compareTo(Person o) {
        return o.getDate().compareTo(dateOfBirth);
    }

    @Override
    public String toString() {
        return "name: " + name + ", date of birth: " + dateFormat.format(dateOfBirth);
    }
}
