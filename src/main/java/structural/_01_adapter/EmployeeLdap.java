package structural._01_adapter;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

}