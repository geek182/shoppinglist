package com.geek182.shoppinglist;

public class List {
    private String Author;
    private String ListName;
    private String Description;

    public void CreateList(String Author, String ListName, String Description){
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
}
