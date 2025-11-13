public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void payment(int amount) {

        System.out.println("Paid " + amount + " CreditCardPayment.");



    }
}
