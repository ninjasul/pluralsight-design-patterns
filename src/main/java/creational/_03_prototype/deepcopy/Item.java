package creational._03_prototype.deepcopy;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Item implements Cloneable{
    private String title;
    private double price;
    private String url;
    private List<String> keywords;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}