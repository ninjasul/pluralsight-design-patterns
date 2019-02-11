package structural._03_composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    @Getter
    String name;

    @Getter
    String url;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public abstract String toString();

    protected abstract MenuComponent add(MenuComponent menuComponent);
    protected abstract MenuComponent remove(MenuComponent menuComponent);

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
}