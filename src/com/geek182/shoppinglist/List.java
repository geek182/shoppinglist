package com.geek182.shoppinglist;

import java.util.ArrayList;


public class List {
    private String Author;
    private String ListName;
    private String Description;
   // private Item item;
    private java.util.List<Item> items = new ArrayList<>();

    public List(String Author, String ListName, String Description){
    this.Author = Author ;
    this.ListName = ListName;
    this.Description = Description;
    System.out.println( Author + " have created the list: " + ListName + " successfully" );
    }

    public void GetList(String ListName){
        this.ListName = ListName;
        System.out.println("The list was created by: " + Author);
    }
    public void DeleteList(){
    }
    public void AddItems(Item item){
        items.add(item);
    }

    public void GetItems() {
        System.out.println("Currently on your list");
        for (int i = 0; i < items.size(); i++) {
                items.get(i).GetItemName();
        }
        System.out.println("########");
    }

    public void DeleteAllItems(){
        items.clear();
    }

}