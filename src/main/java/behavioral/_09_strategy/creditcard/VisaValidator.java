package behavioral._09_strategy.creditcard;

public class VisaValidator extends CreditCardValidator {
    @Override
    public boolean isValid(CreditCard creditCard) {

        boolean isValid = creditCard.getNumber().startsWith("4");

        if( isValid ) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if( isValid ) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}