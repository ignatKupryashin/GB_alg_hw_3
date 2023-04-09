public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.addLast(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.addLast(5);
        myList.printList();
        System.out.println();
        myList.reverse();
        myList.printList();
    }
}