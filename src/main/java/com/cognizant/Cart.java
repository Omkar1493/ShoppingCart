package com.cognizant;

import java.util.*;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Cart {
    List<LineItem> cart = new ArrayList<>();
    Item item;

    public int getCartCount() {
        return cart.size();
    }

    public void addItem(Item item, int qty) {
            int total=0;
            LineItem obj1 = new LineItem(item, qty);
            cart.add(obj1);
//            System.out.print(obj1.getItem().name+" - "+"x"+obj1.getQty()+" - $"+obj1.getItem().price+"\n");
//            total+=obj1.getItem().price*obj1.getQty();
//            System.out.print("Item Total- $"+total+"\n");
//            if(cart.size()>0){
//                for(LineItem li: cart){
//                    System.out.print(li.getItem().name+"-- $"+li.getItem().price+"--"+li.getItem().onSale+"--"+li.getQty()+"\n");
//
//                }
//            }

    }


    public int getTotalPrice() {
        int total = 0;
        for (LineItem li: cart) {
            total += li.getItem().price*li.getQty();
        }
        out.println("Total - $"+total);
        return total;

    }

    public String getItemsOnSale() {
        String s ="";
        //out.println(item.getName());
        for (LineItem li: cart) {
            if(li.getItem().onSale){
               s = String.format("Name=%s, Price = $%d", li.getItem().getName(), li.getItem().getPrice());
            }

        }
        return s;
    }


    public int getItemizedList() {
        int total = 0;
        for (LineItem li: cart) {
            System.out.print(li.getItem().name+" - "+"x"+li.getQty()+" - $"+li.getItem().price+"\n");
            total += li.getItem().price*li.getQty();
        }
        out.println("Cart Total - $"+total);
        return cart.size();
    }
}