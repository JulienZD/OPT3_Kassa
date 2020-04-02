import java.util.ArrayList;

public class CashRegister {
    private ArrayList<Product> products;

    public CashRegister() {
        products = new ArrayList<>();
    }

    public int getCount() {
        return products.size();
    }

    /* Adds a product with price */
    public void addItem(Product product) {
        products.add(product);
    }

    /* Calculates the price of an order (including discount) */
    public double computeTotal() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
        if(total >= 100.0 && products.size() >= 3){
            return total * 0.9;
        }
        return total;
    }

    /* Clears the register for the next customer */
    public void clear() {
        products.clear();
    }
}
