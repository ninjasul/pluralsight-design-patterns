package behavioral._06_memento.employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeClient {

    private static final Logger log = LogManager.getLogger(EmployeeClient.class);

    public static void main(String[] args) {
        Employee emp = Employee.builder()
                .name("John Wick")
                .address("111 Main Street")
                .phone("888-555-1212")
                .build();

        log.info("Employee before save: {}", emp);

        CareTaker careTaker = new CareTaker();
        careTaker.save(emp);

        emp.setPhone("444-555-6666");
        careTaker.save(emp);
        log.info("Employee after changed phone number save: {}", emp);

        emp.setPhone("333-999-6666");
        careTaker.revert(emp);
        log.info("Reverts to the last save point: {}", emp);

        careTaker.revert(emp);
        log.info("Reverts to original : {}", emp);
    }
}