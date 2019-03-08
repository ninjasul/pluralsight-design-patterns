package creational._03_prototype.swallowcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Statement implements Cloneable {

    private String sql;
    private List<String> parameters;
    private Record record;

    protected Statement clone() {
        try {
            return (Statement)super.clone();
        }
        catch ( CloneNotSupportedException e ) {
            e.printStackTrace();
        }

        return null;
    }
}