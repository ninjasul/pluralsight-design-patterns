package behavioral._04_Iterator.java.util.iterator;

import java.util.*;

public class IteratorClient {

    public static void main(String[] args) {
       //List<String> names = new ArrayList<>();
        Set<String> names = new HashSet<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> iterator = names.iterator();

        while( iterator.hasNext() ) {
            String name = iterator.next();
            System.out.println(name);
            iterator.remove();
        }

        System.out.println("Names size: " + names.size());
    }

}