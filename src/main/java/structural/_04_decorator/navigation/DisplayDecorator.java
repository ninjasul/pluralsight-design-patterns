package structural._04_decorator.navigation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public abstract class DisplayDecorator implements Display {

    @Setter
    protected Display display;

    @Override
    public void draw() {
        display.draw();
    }
}