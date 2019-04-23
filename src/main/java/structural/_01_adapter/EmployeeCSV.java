package structural._01_adapter;

import lombok.*;

import java.util.StringTokenizer;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmployeeCSV {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");

        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }

        if (tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }

        if (tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }

        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }
}