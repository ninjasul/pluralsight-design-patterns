package behavioral._09_strategy.person;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Person {

    private String name;
    private String phoneNumber;
    private int age;
}