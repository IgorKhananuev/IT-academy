package streamAPIandLambdaTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunnerTask1withLambda {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Name1"));
        persons.add(new Person(10, "Name3"));
        persons.add(new Person(6, "Name2"));
        persons.add(new Person(9, "Name7"));

        Comparator<Person> sortedByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Person> sortedByAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                }
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        System.out.println("Sorted by age");
        Collections.sort(persons, Comparator.comparing(Person::getAge));
        persons.forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted by name");
        Collections.sort(persons, Comparator.comparing(Person::getName));
        persons.forEach(System.out::println);
    }
}
