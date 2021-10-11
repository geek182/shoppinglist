package com.geek182.shoppinglist;

public class List {
    private String Author;
    private String ListName;
    private String Description;
    private Item item;

    public void CreateList(String Author, String ListName, String Description){
    this.Author = Author ;
    this.ListName = ListName;
    this.Description = Description;
    this.item = new Item();

    System.out.println( Author + " have created the list: " + ListName + " successfully" );
    }

    public void GetList(String ListName){
        this.ListName = ListName;

        System.out.println("The list was created by: " + Author);
    }
    public void DeleteList(){
    }
    public void CreateItens(String Item, int quantity){
        item.AddItem(Item,quantity);
        
    }
    public void GetItens(){
        item.GetItens();
    }
}
