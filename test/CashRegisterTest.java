import org.junit.Assert;
import org.junit.Test;

public class CashRegisterTest {

    @Test
    public void addItem() {
    }

    @Test
    public void computeTotal() {
        CashRegister c = new CashRegister();
        Assert.assertEquals(0.0, c.computeTotal(), 0.00001);
        Assert.assertEquals(0, c.getCount());
        Product item1 = new Product("a");
        item1.setPrice(10);
        c.addItem(item1);
        Assert.assertEquals(1, c.getCount());
        Assert.assertEquals(10.0, c.computeTotal(), 0.00001);
        Product item2 = new Product("b");
        item2.setPrice(20);
        c.addItem(item2);
        Assert.assertEquals(2, c.getCount());
        Assert.assertEquals(30.0, c.computeTotal(), 0.00001);
        Product item3 = new Product("c");
        item3.setPrice(20);
        c.addItem(item3);
        Assert.assertEquals(50.0, c.computeTotal(), 0.00001);
        Assert.assertEquals(3, c.getCount());
        Product item4 = new Product("d");
        item4.setPrice(60);
        c.addItem(item4);
        Assert.assertEquals(99.0, c.computeTotal(), 0.00001);
        Assert.assertEquals(4, c.getCount());
        c.clear();
        Assert.assertEquals(0.0, c.computeTotal(), 0.00001);
        Assert.assertEquals(0, c.getCount());
    }

    @Test
    public void clear() {
    }
}
