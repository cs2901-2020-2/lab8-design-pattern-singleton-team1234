package lab;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ChocolateBoilerTest {
    @Test(threadPoolSize = 20)
    public void Test_creation(){
        ChocolateBoiler chocolate = new ChocolateBoiler();
        chocolate.boil();
        chocolate.drain();
        Assert.assertFalse(chocolate.isBoiled());
        Assert.assertTrue(chocolate.isEmpty());
    }

    @Test
    public void Test_fill_initial(){
        ChocolateBoiler chocolate = new ChocolateBoiler();
        chocolate.fill();
        Assert.assertFalse(chocolate.isEmpty());
        Assert.assertFalse(chocolate.isBoiled());
    }

    @Test
    public void Test_drain_initial(){
        ChocolateBoiler chocolate = new ChocolateBoiler();
        chocolate.drain();
        Assert.assertFalse(chocolate.isBoiled());
        Assert.assertTrue(chocolate.isEmpty());
    }

    @Test
    public void Test_boil_initial(){
        ChocolateBoiler chocolate = new ChocolateBoiler();
        chocolate.boil();
        Assert.assertFalse(chocolate.isBoiled());
        Assert.assertTrue(chocolate.isEmpty());
    }

    @Test(threadPoolSize = 50)
    public void Test_behavior() {
        ChocolateBoiler chocolate = new ChocolateBoiler();
        chocolate.fill();

        Assert.assertFalse(chocolate.isEmpty());
        Assert.assertFalse(chocolate.isBoiled());

        chocolate.boil();

        Assert.assertFalse(chocolate.isEmpty());
        Assert.assertFalse(chocolate.isBoiled());

        chocolate.drain();

        Assert.assertFalse(chocolate.isEmpty());
        Assert.assertFalse(chocolate.isBoiled());
    }
}
