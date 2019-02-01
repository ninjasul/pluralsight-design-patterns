package structural._01_adapter;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        log.info(employees);
    }
}