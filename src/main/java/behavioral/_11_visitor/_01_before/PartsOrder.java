package behavioral._11_visitor._01_before;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class PartsOrder implements AtvPart {
    private List<AtvPart> parts = new ArrayList<>();


    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    public double calculateShipping() {

        double shippingAmount = 0;

        for( AtvPart part : parts ) {
            shippingAmount += part.calculateShipping();
        }

        return shippingAmount;
    }
}