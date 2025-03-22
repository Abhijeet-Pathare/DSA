public class LinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    Node getHead() {
        return head;
    }

    Node getTail() {
        return tail;
    }

    int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

        public void append ( int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }

        //Remove Last
    public Node removeLast(){
       if(length == 0)
           return null;
       Node temp = head;
       Node pre = head;
       while(temp.next != null){
           pre = temp;
           temp = temp.next;
       }
       tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
}