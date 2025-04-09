package stack;

public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    //constructor
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        top.next = null;
        height = 1;
        System.out.println("in stack constructor");
    }

    //print elements in stack

}
