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

    public void getTop(){
        System.out.println("Top: "+top.value);
    }

    public void getHeight(){
        System.out.println("Height: "+height);
    }
}
