package behavioral._10_templatemethod.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonClient {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(Person.builder()
                .name("Bryan")
                .phoneNumber("801-555-1212")
                .age(39)
                .build());

        people.add(Person.builder()
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

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContent(people);
    }

    private static void printContent(List<Person> people) {
        for( Person person : people ) {
            System.out.println(person.getName());
        }
    }

}