package behavioral._09_strategy.creditcard;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class CreditCard {

    private String number;
    private String date;
    private String cvv;

    private CreditCardValidator strategy;

    public CreditCard(CreditCardValidator strategy) {
        this.strategy = strategy;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }
}