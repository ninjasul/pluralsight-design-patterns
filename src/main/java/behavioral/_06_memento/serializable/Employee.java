package behavioral._06_memento.serializable;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class Employee implements Serializable {
    private String name;
    private String address;
    private String phone;
}