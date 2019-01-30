package behavioral._06_memento.serializable;

import lombok.extern.log4j.Log4j2;

import java.io.*;

@Log4j2
public class SerializableClient {

    private static final String FILE_PATH = "src/main/resources/";
    private static final String FILE_NAME = "employee.ser";

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Bryan Hansen");
        emp.setAddress("111 E Code Street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        Employee newEmp = deserialize();

        log.info("name: {}", newEmp.getName());

    }

    private static void serialize(Employee emp) {

        try {
            FileOutputStream fileOut = new FileOutputStream( FILE_PATH + FILE_NAME );
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deserialize() {
        Employee emp = null;

        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(FILE_PATH + FILE_NAME );
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();

        } catch ( IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return emp;
    }
}