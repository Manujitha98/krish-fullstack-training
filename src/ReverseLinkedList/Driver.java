package ReverseLinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addLast("A");
        myList.addLast("B");
        myList.addLast("C");
        myList.addLast("D");
        myList.addLast("D");
        myList.addLast("C");
        myList.addLast("B");
        myList.addLast("A");

        myList.printLinkedList();
        myList.checkPalindrome();

    }

}
