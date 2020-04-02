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
        c.addItem(10);
        Assert.assertEquals(1, c.getCount());
        Assert.assertEquals(10.0, c.computeTotal(), 0.00001);
        c.addItem(20);
        Assert.assertEquals(2, c.getCount());
        Assert.assertEquals(30.0, c.computeTotal(), 0.00001);
        c.addItem(20);
        Assert.assertEquals(50.0, c.computeTotal(), 0.00001);
        Assert.assertEquals(3, c.getCount());
        c.addItem(60);
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
