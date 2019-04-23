package com.cognizant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class ItemsTest {
    Cart cart;
    @Before
    public void setup(){
        cart = new Cart();
    }

    @Test
    public void cartIsEmptyWhenOpened() {
        //expected
        int expected = 0;

        //actual
        int actual = cart.getCartCount();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }

    @Test
    public void cartIsNotEmptyAfterAddingItems() {
        //expected
        int expected = 3;

        //actual
        cart.addItem(new Item("apple", 5, false), 1);
        cart.addItem(new Item("orange", 4, true), 6);
        cart.addItem(new Item("cabbage", 2, false), 2);
        int actual = cart.getCartCount();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }

    @Test
    public void getTotalPriceOfCart() {
        //expected
        int expected = 45;

        //actual
        cart.addItem(new Item("apple", 5, false), 1);
        cart.addItem(new Item("orange", 10, true), 2);
        cart.addItem(new Item("cabbage", 20, false), 1);
        int actual = cart.getTotalPrice();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }

    @Test
    public void getItemizedList() {
        //expected
        int expected = 3;

        //actual
        cart.addItem(new Item("apple", 5, false), 1);
        cart.addItem(new Item("orange", 10, true), 2);
        cart.addItem(new Item("cabbage", 20, false), 1);
        int actual = cart.getItemizedList();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }

    @Test
    public void getItemPriceAndQuantity() {
        //expected
        int expected = 15;

        //actual
        cart.addItem(new Item("apple", 5, false), 3);
        //cart.addItem(new Item("orange", 10, true), 2);
        //cart.addItem(new Item("cabbage", 20, false), 1);
        int actual = cart.getTotalPrice();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }

    @Test
    public void getOnlySaleItems() {
        //expected
        String expected ="apple";

        //actual
        cart.addItem(new Item("apple", 5, true), 3);
//        cart.addItem(new Item("orange", 10, true), 2);
        cart.addItem(new Item("cabbage", 20, false), 1);
        String actual = cart.getItemsOnSale();

        //assert
//        Assert.(expected, actual);
        assertThat(actual, containsString(expected));

        //teardown
    }
}
