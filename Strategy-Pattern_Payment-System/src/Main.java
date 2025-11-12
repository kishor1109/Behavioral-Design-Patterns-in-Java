//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShoppingCart cart=new ShoppingCart();

        cart.addItem(40);
        cart.addItem(60);

        System.out.println("Total:"+cart.calculateTotal());

        cart.payment(new CryptoPayment());

        cart.payment(new CreditCardPayment());

        cart.payment(new PayPalPayment());

        cart.payment(new UPIPayment());









        }
    }
