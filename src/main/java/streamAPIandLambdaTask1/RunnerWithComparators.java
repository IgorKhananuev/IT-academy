package streamAPIandLambdaTask1;

import java.util.ArrayList;
import java.util.Comparator;

public class RunnerWithComparators {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Name1"));
        persons.add(new Person(10, "Name3"));
        persons.add(new Person(6, "Name2"));
        persons.add(new Person(9, "Name7"));

        Comparator<Person> sortedByName = Comparator.comparing(Person::getName);

        Comparator<Person> sortedByAge = (o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            }
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        };

        System.out.println("Sorted by age");
        persons.sort(sortedByAge);
        persons.forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted by name");
        persons.sort(sortedByName);
        persons.forEach(System.out::println);
    }
}
