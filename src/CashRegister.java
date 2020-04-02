public class CashRegister {
    /* Keep track of the total price */
    private double total = 0.0;
    /* Keep track of the item count */
    public int count = 0;

    public CashRegister() {

    }

    public int getCount() {
        return count;
    }


    /* Adds a product with price */
    public void addItem(double price) {
        this.total = this.total+price;
        count++;
    }

    /* Calculates the price of an order (including discount) */
    public double computeTotal() {
        if(this.total >= 100.0 && this.count > 3){
            return this.total * 0.9;
        }
        return this.total;
    }

    /* Clears the register for the next customer */
    public void clear() {
        this.total = 0.0;
        this.count = 0;
    }
}
