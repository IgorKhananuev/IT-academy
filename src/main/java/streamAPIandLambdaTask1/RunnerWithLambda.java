package streamAPIandLambdaTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunnerWithLambda {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Name1"));
        persons.add(new Person(10, "Name3"));
        persons.add(new Person(6, "Name2"));
        persons.add(new Person(9, "Name7"));

        System.out.println("Sorted by age");
        persons.sort(Comparator.comparing(Person::getAge));
        persons.forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted by name");
        persons.sort(Comparator.comparing(Person::getName));
        persons.forEach(System.out::println);
    }
}
