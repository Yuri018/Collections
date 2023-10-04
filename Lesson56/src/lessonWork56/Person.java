package lessonWork56;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private transient Car car;//поле не будет выгружено

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
