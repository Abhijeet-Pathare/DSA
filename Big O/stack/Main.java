package stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(1);
        myStack.printStack();
        myStack.push(2);
        myStack.printStack();
        myStack.getHeight();
        myStack.getTop();
    }
}
