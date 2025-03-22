public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(4);
        //myList.printList();
        myList.append(5);
//        myList.printList();
        myList.append(6);
//        System.out.println("removing 6");
//        System.out.println(myList.removeLast().value);
//        myList.prepend(3);
//        myList.printList();
//        System.out.println(myList.removeFirst().value);
//        System.out.println(myList.get(2).value);
//        System.out.println(myList.set(1,1));
        System.out.println("************");
        System.out.println(myList.insert(1,3));
        myList.printList();
        System.out.println("************");
        System.out.println("Removed : "+myList.remove(1).value);
        myList.printList();

    }
}
