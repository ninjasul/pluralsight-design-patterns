package behavioral._04_Iterator.stringrepository;

import java.util.Iterator;

public class StringRepositoryClient {

    public static void main(String[] args) {
        BikeRepository repository = new BikeRepository();
        repository.addBike("Cervelo");
        repository.addBike("Scott");
        repository.addBike("Fuji");

        Iterator<String> iterator = repository.iterator();

        while (iterator.hasNext()) {
            String bike = iterator.next();
            System.out.println(bike);
        }

/*
        while( iterator.hasNext()) {
            iterator.remove();
        }
*/
    }
}