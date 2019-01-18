package behavioral._09_strategy.creditcard;


public class CreditCardClient {

    public static void main(String[] args) {

        CreditCard amexCard = CreditCard.builder()
                .strategy(new AmexValidator())
                .number("379185883464283")
                .date("04/2020")
                .cvv("123")
                .build();

        System.out.println("Is Amex valid: " + amexCard.isValid());


        CreditCard amexCard2 = CreditCard.builder()
                .strategy(new AmexValidator())
                .number("379185883464282")
                .date("04/2017")
                .cvv("234")
                .build();

        System.out.println("Is Amex2 valid: " + amexCard2.isValid());

        CreditCard visaCard = CreditCard.builder()
                .strategy(new VisaValidator())
                .number("4539589763663402")
                .date("05/2018")
                .cvv("324")
                .build();

        System.out.println("Is Visa valid: " + visaCard.isValid());

    }
}