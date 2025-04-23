package binarySearchTree;

public class BinarySearchTree {
    Node root;
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    //Insert method
    public boolean insert(int value){
        //Create newNode
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        //while loops condition is true because we are going to come out
        //with a return statement
        while(true){
            if(newNode.value == temp.value){
                return false;
            }
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

}
