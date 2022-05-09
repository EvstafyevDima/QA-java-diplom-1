package praktikum.diplom1;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {


    Bun bun = new Bun("test", (float) 15.2);

    @Test
    public void getName() {
        Assert.assertEquals(bun.getName(), "test");
    }

    @Test
    public void getPrice() {
        Assert.assertEquals(bun.getPrice(), 15,2);
    }

}
