package behavioral._10_templatemethod.person;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Person  implements Comparable<Person>{

    private String name;
    private String phoneNumber;
    private int age;

    @Override
    public int compareTo(Person o) {

        if( this.age > o.age ) {
            return 1;
        }

        if( this.age < o.age ) {
            return -1;
        }

        return 0;
    }
}