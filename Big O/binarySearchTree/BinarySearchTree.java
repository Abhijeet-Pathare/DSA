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

    //contains method
    public boolean contains(int value){
        /*
        this code is not required. If the BST is empty we return false
        after the while loop if we dont find the value
                if(root == null){
                    return false;
                }
        */
        Node temp = root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }else if(value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }

}
