package lab;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ChocolateBoilerSingletonTest {

    @Test(threadPoolSize = 50)
    public void Test_creation_initial(){
        ChocolateBoilerSingleton chocolate = ChocolateBoilerSingleton.getInstance();
        chocolate.boil();
        chocolate.drain();
        Assert.assertFalse(chocolate.isBoiled());
        Assert.assertTrue(chocolate.isEmpty());
    }

    @Test
    public void Test_fill_initial(){
        ChocolateBoilerSingleton chocolate = ChocolateBoilerSingleton.getInstance();
        chocolate.fill();
        Assert.assertFalse(chocolate.isEmpty());
        Assert.assertFalse(chocolate.isBoiled());
    }

    @Test
    public void Test_drain_initial(){
        ChocolateBoilerSingleton chocolate = ChocolateBoilerSingleton.getInstance();
        chocolate.drain();
        Assert.assertFalse(chocolate.isBoiled());
        Assert.assertTrue(chocolate.isEmpty());
    }

    @Test
    public void Test_boil_initial(){
        ChocolateBoilerSingleton chocolate = ChocolateBoilerSingleton.getInstance();
        chocolate.boil();
        Assert.assertFalse(chocolate.isBoiled());
        Assert.assertTrue(chocolate.isEmpty());
    }

    @Test(threadPoolSize = 50)
    public void Test_behavior() {
        ChocolateBoilerSingleton chocolate = ChocolateBoilerSingleton.getInstance();
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
