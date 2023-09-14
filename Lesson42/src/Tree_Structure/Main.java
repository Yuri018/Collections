package Tree_Structure;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(-1);
        set.add(10);
        set.add(553);
        set.add(-66);
        set.add(0);
        System.out.println(set);

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Ann", 13));
        personSet.add(new Person("Jack", 10));
        personSet.add(new Person("Nick", 7));
        personSet.add(new Person("Bill", 9));
        personSet.add(new Person("Lena", 13));

        System.out.println(personSet);

        Set<Person> personSet2 = new TreeSet<>(
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );
        personSet2.add(new Person("Ann", 13));
        personSet2.add(new Person("Jack", 10));
        personSet2.add(new Person("Nick", 7));
        personSet2.add(new Person("Bill", 9));
        personSet2.add(new Person("Lena", 13));
        System.out.println(personSet2);
    }
}
