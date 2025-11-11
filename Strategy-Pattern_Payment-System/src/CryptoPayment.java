public class CryptoPayment implements PaymentStrategy{
    @Override
    public void payment(int amount) {
        System.out.println("Paid"+amount+"Using Cryptocurrency.");
    }
}
