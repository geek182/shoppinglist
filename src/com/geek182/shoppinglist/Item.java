package com.geek182.shoppinglist;

public class Item {
    private String ItemName;
    private int quantity;

    public Item(String ItemName, int quantity){
        this.ItemName = ItemName ;
        this.quantity = quantity;
    }
    public void GetItemName(){
        System.out.println("Item: "+ ItemName);
    }

}
