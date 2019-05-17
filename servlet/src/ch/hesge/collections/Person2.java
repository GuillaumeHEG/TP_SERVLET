package ch.hesge.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person2 {
    private final String name;
    private final String avs;

    public Person2(String name, String avs) {
        this.name = name;
        this.avs = avs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return Objects.equals(name, person2.name) &&
                Objects.equals(avs, person2.avs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avs);
    }

    public static void main(String... args) {
        Person2 p1 = new Person2("John Doe", "756-1234-5678-97");
        Person2 p2 = new Person2("John Doe", "756-1234-5678-97");
        Person2 p3 = new Person2("John Amden", "111-11-111-113");
        Set persons = new HashSet();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons.size());
        System.out.println(p1.equals(p2));
    }

}
