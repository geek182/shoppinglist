package com.geek182.shoppinglist;
import java.util.ArrayList;

public class Item {
    private String ItemName;
    private int quantity;
    ArrayList<String> Itens = new ArrayList<String>();

    public void AddItem(String ItemName, int quantity){
        this.ItemName = ItemName;
        this.quantity= quantity;
        if (quantity <= 0 ){
            System.out.println("Sorry you must provide a quantity for the item " + ItemName);
        }
        else {
            //add item to array
            Itens.add(ItemName);
            System.out.println("The item " + ItemName + " was added to your list");
        }
        }

    public void GetItens() {
        System.out.println("Currently on your list");
        for (int i = 0; i < Itens.size(); i++) {
            System.out.println(Itens.get(i));
        }
    }
    public void DeleteItem() {

    }
}
