package structural._01_adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ID: " + instance.getId();
    }
}