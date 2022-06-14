package LinkedListAssignment;

public class LinkedList {

    Link head;

    public void addFront(String value) {

        Link item = new Link(value);
        item.next = head;
        head = item;

    }

    public String removeFront() {

        if (head != null) {
            if (head.next != null) {
                Link temp = head;
                head = head.next;
                return temp.value;
            } else {
                Link temp = head;
                head = null;
                return temp.value;
            }
        }
        return null;
    }

    public void addLast(String value) {

        if (head != null) {
            Link current = head;
            while (current.next != null) {
                current = current.next;
            }

            Link item = new Link(value);
            current.next = item;
        } else {
            head = new Link(value);
        }

    }

    public String removeLast() {

        if (head != null) {
            Link current = head;
            Link previous = current;
            while (current.next != null) {
                previous = current;
                current = current.next;

            }

            if (current == head) {
                head = null;
                return current.value;
            }

            previous.next = null;
            return current.value;

        }

        return null;

    }

    public void reverseList() {
        // Find number of elements in the LinkedList
        int count = 1;
        Link current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        // utility function to reverse List recursively
        reverseUtil(count);

    }

    private void reverseUtil(int step) {
        if (step < 1)
            return;
        String temp = removeFront();
        reverseUtil(step - 1);
        addLast(temp);

    }
}
