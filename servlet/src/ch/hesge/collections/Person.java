package ch.hesge.collections;

import java.util.Comparator;

public class Person {
    private final String firstName;
    private final String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    static class ByFirstNameComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if (!(o1 instanceof Person) || !(o1 instanceof Person)){
                throw new IllegalArgumentException();
            }

            Person person1 = (Person)o1;
            Person person2 = (Person)o2;

            int resultFirstName = person1.getFirstName().compareTo(person2.getFirstName());
            if (resultFirstName == 0){
                return  person1.getLastName().compareTo(person2.getLastName());
            }
            else {
                return resultFirstName;
            }
        }
    }



    static class ByLastNameComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            if (!(o1 instanceof Person) || !(o1 instanceof Person)){
                throw new IllegalArgumentException();
            }

            Person person1 = (Person)o1;
            Person person2 = (Person)o2;

            int resultLastName = person1.getLastName().compareTo(person2.getLastName());
            if (resultLastName == 0){
                return  person1.getFirstName().compareTo(person2.getFirstName());
            }
            else {
                return resultLastName;
            }
        }

    }

}
