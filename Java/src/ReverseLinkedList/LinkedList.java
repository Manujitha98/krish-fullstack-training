package ReverseLinkedList;

public class LinkedList {

    Link head;

    public void printLinkedList() {
        Link current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

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
        reverseUtil(head);
    }

    private void reverseUtil(Link step) {
        if (step.next == null)
            return;
        String temp = removeFront();
        reverseUtil(step.next);
        addLast(temp);

    }

    public void checkPalindrome() {
        palindromeUtil(head);

    }

    private Link palindromeUtil(Link step) {

        if (step.value.equals(step.next.value)) {

            return step.next.next;
        }

        if (!step.value.equals(step.next.value)) {
            Link secondHead = palindromeUtil(step.next);
            if (secondHead.value.equals(step.value)) {
                if (secondHead.value.equals(head.value)) {
                    System.out.println("The Linked List is a Palindrome!");
                }
                return secondHead.next;
            }
        }

        return step.next;

    }

}
