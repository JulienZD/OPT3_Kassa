/*
TODO: Als ik het programma start, moet computeTotal () € 0 opleveren en moet getCount () 0 als resultaat teruggeven.
TODO: Als ik een item toevoeg met een prijs van € 10, moet computeTotal () € 10 opleveren en moet getCount 1 als resultaat teruggeven.
TODO: Als ik nog een item toevoeg met een prijs van € 20, moet computeTotal () € 30 opleveren en moet getCount 2 als resultaat teruggeven.
TODO: Als ik nog een item toevoeg met een prijs van € 20, moet computeTotal () € 50 opleveren en moet getCount 3 als resultaat teruggeven (LET OP: zonder korting, want totaalprijs is nog lager dan €
    - 100,00).
TODO: Als ik nog een item toevoeg met een prijs van € 60, moet computeTotal () € 99 opleveren en moet getCount 4 als resultaat teruggeven (LET OP: nu wel met korting!!!).
TODO: Als ik daarna clear () aanroep moet computeTotal () € 0 opleveren en moet getCount 0 als resultaat teruggeven.
*/


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
