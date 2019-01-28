package behavioral._04_Iterator.stringrepository;

import java.util.Iterator;

public class BikeIterator implements Iterator<String> {

    private String[] bikes;
    private int index = 0;

    public BikeIterator(String[] bikes) {
        this.bikes = bikes;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bikes.length && bikes[index] != null;
    }

    @Override
    public String next() {
        return bikes[index++];
    }

}
