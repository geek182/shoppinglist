package com.geek182.shoppinglist;

public class Main {

    public static void main(String[] args) {
	// nao esquece de trazer o pao!!
        List mylist3 = new List("Leandro","Weekly","for the week");
        Item pao = new Item("Pao",2);
        Item milk = new Item("Milk", 1);
        Item juice = new Item("Apple Juice", 1);
        mylist3.AddItems(pao);
        mylist3.AddItems(milk);
        mylist3.AddItems(juice);
        mylist3.GetItems();

        List mylist4 = new List("Leandro","FridayNight","Friday night snacks");
        Item pizza = new Item("Pizza", 2 );
        Item soda = new Item("Soda",10);
        mylist4.AddItems(pizza);
        mylist4.AddItems(soda);
        mylist4.GetItems();

    }
}
