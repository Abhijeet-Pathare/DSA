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
    public void printStack(){
        if(top == null || height==0){
            System.out.println("Stack is empty!");;
        }else{
            Node temp = top;
            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    //push method to add elements to the top of the stack
    public void push(int value){
        //create a node with the value
        Node newNode = new Node(value);
        //check if the stack has any elements or is empty
        //top == null
        if(height == 0) {
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        //we increase height out of the if else block because in either conditions we are going to add an element to the stack
        height++;
    }

    public void getTop(){
        System.out.println("Top: "+top.value);
    }

    public void getHeight(){
        System.out.println("Height: "+height);
    }
}
