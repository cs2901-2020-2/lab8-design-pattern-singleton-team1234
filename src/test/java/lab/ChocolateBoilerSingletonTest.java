package lab;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ChocolateBoilerSingletonTest {


    @Test(invocationCount = 80, threadPoolSize = 80)
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
