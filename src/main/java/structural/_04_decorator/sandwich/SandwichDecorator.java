package structural._04_decorator.sandwich;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public abstract class SandwichDecorator implements Sandwich {

    @Setter
    private Sandwich customSandwich;

    @Override
    public String make() {
        return customSandwich.make();
    }
}