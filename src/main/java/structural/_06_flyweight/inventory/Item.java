package structural._06_flyweight.inventory;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public class Item {

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}