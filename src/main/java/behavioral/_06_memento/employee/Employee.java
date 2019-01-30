package behavioral._06_memento.employee;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Employee {
    private String name;
    private String address;
    private String phone;

    public EmployeeMemento save() {
        return EmployeeMemento.builder()
                .name(name)
                .phone(phone)
                .build();
    }

    public void revert(EmployeeMemento emp) {
        name = emp.getName();
        phone = emp.getPhone();
    }

}