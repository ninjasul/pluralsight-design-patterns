package structural._01_adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "ID: " + instance.getCn();
    }
}