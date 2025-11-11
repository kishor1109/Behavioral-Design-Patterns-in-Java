public class PayPalPayment implements PaymentStrategy{
    @Override
    public void payment(int amount) {
        System.out.println("Paid"+amount+"Using Paypal.");
    }
}
