package praktikum.diplom1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    Burger burger = new Burger();

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;


    @Test
    public void setBunsNameTest() {
        burger.setBuns(bun);
        Mockito.when(bun.getName()).thenReturn("Brezel");
        assertEquals("Brezel", burger.bun.getName());

    }


    @Test
    public void addThreeIngredientsTest() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        Assert.assertEquals(3, burger.ingredients.size());
    }

    @Test
    public void  removeIngredientTest() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertTrue(burger.ingredients.isEmpty());
    }

    @Test
    public void moveIngredientTest() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.moveIngredient(0, 1);
        assertEquals(2, burger.ingredients.size());
    }



    @Test
    public void getReceiptIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        Mockito.when(bun.getName()).thenReturn("Brezel");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);

        assertThat(burger.getReceipt(), containsString("==== Brezel ===="));
    }

}
