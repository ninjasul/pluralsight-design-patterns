package creational._03_prototype.deepcopy;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item implements Cloneable{
    private String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}