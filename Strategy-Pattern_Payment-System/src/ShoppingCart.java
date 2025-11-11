import java.util.*;

public class ShoppingCart {

    private List<Integer> items = new ArrayList<>();

    public void addItem(int price) {
        items.add(price);

        System.out.println("Added Item Worth" + price);
    }

    public int calculateTotal() {
        int total = 0;
        for (int price : items) {

            total += price;
        }
        return total;
    }

    public void payment(PaymentStrategy strategy){
        int total=calculateTotal();
        System.out.println("Total:"+total);
        strategy.payment(total);
    }
}
