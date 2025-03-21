public class LinkedList {
    Node head;
    Node tail;
    int length;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    Node getHead(){
        return head;
    }
    Node getTail(){
        return tail;
    }
    int getLength(){
        return length;
    }
}
