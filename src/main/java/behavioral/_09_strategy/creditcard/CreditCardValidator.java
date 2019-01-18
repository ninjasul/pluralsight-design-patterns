package behavioral._09_strategy.creditcard;

public abstract class CreditCardValidator {
    public abstract boolean isValid(CreditCard creditCard);

    protected boolean passesLuhn(String creditCardNumber) {
        int sumOfDigit = 0;
        boolean alternate = false;

        for( int length = creditCardNumber.length(), i = length-1; i >= 0; --i ) {

            int curDigit = getDigitOfIndex(creditCardNumber, i);

            if( alternate ) {
                curDigit *= 2;
                if( curDigit > 9 ) {
                    curDigit = ( curDigit % 10 ) + 1;
                }
            }

            sumOfDigit += curDigit;
            alternate = !alternate;

        }

        return ( sumOfDigit % 10 == 0 );
    }

    private int getDigitOfIndex(String str, int i) {
        return Integer.parseInt(str.substring(i, i+1));
    }
}