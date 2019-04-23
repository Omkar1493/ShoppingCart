package com.cognizant;

import java.util.ArrayList;
import java.util.List;

public class Item {

    String name;
    int price;
    boolean onSale;


    public Item(String name, int price, boolean onSale) {
        this.name=name;
        this.price=price;
        this.onSale=onSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}