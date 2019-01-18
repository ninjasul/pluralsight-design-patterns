package behavioral._09_strategy.person;

import behavioral._10_templatemethod.person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonClient {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(behavioral._10_templatemethod.person.Person.builder()
                .name("Bryan")
                .phoneNumber("801-555-1212")
                .age(39)
                .build());

        people.add(behavioral._10_templatemethod.person.Person.builder()
                .name("Mark")
                .phoneNumber("801-444-1234")
                .age(41)
                .build());

        people.add(Person.builder()
                .name("Chris")
                .phoneNumber("801-222-5151")
                .age(38)
                .build());

        System.out.println("Unsorted");
        printContent(people);

        Collections.sort(people, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));

        System.out.println("\nSorted by age");
        printContent(people);

        Collections.sort(people, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println("\nSorted by name");
        printContent(people);
    }

    private static void printContent(List<Person> people) {
        for( Person person : people ) {
            System.out.println(person.getName());
        }
    }

}