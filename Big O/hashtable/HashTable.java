package hashtable;

import java.sql.SQLOutput;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public class Node{
        private String key;
        private int value;
        private Node next;
        //constructor
        public Node(String key,int value){
            this.key = key;
            this.value = value;
        }

    }
    //constructor
    public HashTable() {
        dataMap = new Node[size];
    }

    //print method
    public void printTable(){
        for(int i=0;i<dataMap.length;i++){
            System.out.println(i+":");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println("  {"+temp.key+" = "+temp.value+" }");
                temp = temp.next;
            }
        }
    }

    //Note the method is private
    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i=0;i<keyChars.length;i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    //set method
    public void set(String key,int value){
        //determine at which index to put in
        int index = hash(key);

        //create a node to put in the index
        Node newNode = new Node(key,value);

        /***check if the index is null add
          newNode to the index else iterate
          through the linked list present at the
          index and insert at the end ***/
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }
}
