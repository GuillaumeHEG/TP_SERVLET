package ch.hesge.collections;

import java.sql.Wrapper;
import java.util.*;

public class ManipulationComparator {

    public static void main(String[] args) {
        List list = Arrays.asList(2, 1, "banana", null, "apple", "orange", 3, new Object(), new java.util.Date());

        sortWithSetComparator(list);

        Person person2 = new Person("abc", "cba");
        Person person3 = new Person("abc", "abc");


        comparePersons(person3,person2);
        comparePersons(person2,person3);

        List<Object> list2 = Arrays.asList(2, 1, "banana", null, "apple", "orange", 3, new Object(), new java.util.Date());

        sortWithNaturalComparator(list2);
    }



    public static void comparePersons(Person person1, Person person2){
        Person.ByFirstNameComparator firstNameComparator = new Person.ByFirstNameComparator();
        Person.ByLastNameComparator lastNameComparator = new Person.ByLastNameComparator();
        System.out.println("compare firstNameComparator - " +person1.toString() + ", " + person2.toString() + " : " + firstNameComparator.compare(person1,person2));
        System.out.println("compare lastNameComparator - " +person1.toString() + ", " + person2.toString() + " : " + lastNameComparator.compare(person1,person2));
    }

    public static void sortWithNaturalComparator(List list){
        System.out.println("begin sortWithNaturalComparator : " + list);

        List wrappers = new ArrayList();

        for (Object obj: list) {
            wrappers.add(new ComparableWrapper(obj));
        }

        Collections.sort(wrappers);
        System.out.println("end sortWithNaturalComparator : " +list);
    }


    public static void sortWithSetComparator(List list){
        System.out.println("begin sortWithSetComparator : " + list);
        Collections.sort(list, new ComparatorExplicit());
        System.out.println("end sortWithSetComparator : " +list);
    }

    static class ComparableWrapper implements Comparable
    {
        private final Object o;

        public ComparableWrapper(Object o) {
            this.o = o;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }

    }

}
