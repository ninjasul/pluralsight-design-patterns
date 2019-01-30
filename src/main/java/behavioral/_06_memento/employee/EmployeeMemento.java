package behavioral._06_memento.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class EmployeeMemento {
    private String name;
    private String phone;
}