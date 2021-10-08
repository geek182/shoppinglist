package com.geek182.shoppinglist;
import java.util.ArrayList;

public class Item extends List {
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
        for (int i = 0; i < Itens.size(); i++) {
            System.out.println(Itens.get(i));
            //System.out.println("Currently on your list");
        }
    }
    public void DeleteItem() {

    }
}
