package behavioral._09_strategy.creditcard;

public class AmexValidator extends CreditCardValidator {
    @Override
    public boolean isValid(CreditCard creditCard) {

        boolean isValid = creditCard.getNumber().startsWith("34") ||
                    creditCard.getNumber().startsWith("37");

        if( isValid ) {
            isValid =  creditCard.getNumber().length() == 15;
        }

        if( isValid ) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}