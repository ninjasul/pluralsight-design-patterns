package structural._03_composite;


public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    protected MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    @Override
    protected MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    @Override
    public String toString() {
        return print(this);
    }
}