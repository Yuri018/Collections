package homeWork57;

import java.util.function.Consumer;

public class ConsumerPerson implements Consumer<Person> {
    @Override
    public void accept(Person person) {
        System.out.println();
    }
}
