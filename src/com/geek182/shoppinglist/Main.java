package com.geek182.shoppinglist;

public class Main {

    public static void main(String[] args) {
	// nao esquece de trazer o pao!!

        //List mylist = new List();
        //mylist.CreateList("Leandro", "Weekly", "List for week");
        //mylist.GetList("Weekly");
        //mylist.AddItem("Pao", 1);
        //mylist.AddItem("Milk", 2);
        //mylist.GetItens();

/*        Item mylist = new Item();
        mylist.CreateList("Leandro", "Weekly", "List for week");
        mylist.GetList("Weekly");
        mylist.AddItem("Pao",2);
        mylist.AddItem("Milk",1);
        mylist.GetItens();
*/
        List mylist = new List();
        mylist.CreateList("Leandro","Weekly","List for week");
        mylist.CreateItens("Pao",2);
        mylist.CreateItens("Milk",2);
        mylist.CreateItens("Kaas",1);
        mylist.GetItens();

        List mylist2 = new List();
        mylist2.CreateList("Leo","test", "test2");
        mylist2.CreateItens("soup",2);
        mylist2.GetItens();



    }
}
