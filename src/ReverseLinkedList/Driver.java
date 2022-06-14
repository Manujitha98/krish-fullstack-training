package ReverseLinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addLast("Manujitha");
        myList.addLast("Banula");
        myList.addLast("Janith");
        myList.addLast("Sam");

        myList.reverseList();

        System.out.println(myList.removeFront());
        System.out.println(myList.removeFront());
        System.out.println(myList.removeFront());
        System.out.println(myList.removeFront());

    }

}
