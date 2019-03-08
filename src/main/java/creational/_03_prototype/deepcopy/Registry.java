package creational._03_prototype.deepcopy;

import java.util.*;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem( String type ) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
            item.setKeywords((List<String>) ((ArrayList)item.getKeywords()).clone());
        }
        catch( CloneNotSupportedException e ) {
            e.printStackTrace();
        }

        return item;
    }


    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        setKeywords(movie);

        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        setKeywords(book);

        items.put("Book", book);
    }

    private void setKeywords(Item item) {
        List<String> keywords = new ArrayList<>();
        keywords.add("one");
        keywords.add("two");
        keywords.add("three");
        item.setKeywords(keywords);
    }
}