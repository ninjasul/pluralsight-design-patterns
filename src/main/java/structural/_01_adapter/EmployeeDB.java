package structural._01_adapter;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmployeeDB implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}