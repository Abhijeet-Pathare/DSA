package hashtable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
//        myHashTable.printTable();
        myHashTable.set("nails",100);
        myHashTable.set("tile",50);
        myHashTable.set("lumber",80);

        myHashTable.set("bolts",200);
        myHashTable.set("screws",100);

//        myHashTable.printTable();
//        System.out.println(myHashTable.get("screws"));
        ArrayList<String> keys = myHashTable.keys();
        keys.stream().forEach(System.out::println);


    }
}
