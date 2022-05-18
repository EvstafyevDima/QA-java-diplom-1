package praktikum.diplom1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTest {

    private String name;
    private float price;
    private IngredientType type;

    public IngredientTest(String name, float price, IngredientType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getIngredient() {
        return new Object[][]{
                {"Булочка", 10, IngredientType.FILLING},
                {"Котлета", 10.10F, IngredientType.SAUCE}
        };
    }

    @Test
    public void ingredientGetName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        String actualName = ingredient.getName();
        Assert.assertEquals(name, actualName);
    }
    @Test
    public void ingredientGetPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        float actualPrice = ingredient.getPrice();
        Assert.assertEquals(price, actualPrice, 0.001);
    }

    @Test
    public void ingredientGetType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actualType = ingredient.getType();
        Assert.assertEquals(type, actualType);
    }
}