package linkedlist;

public class SinglyLinkedList {

    private Node head;

    private static class Node {

        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public void add(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public boolean contains(int value) {

        Node current = head;

        while (current != null) {

            if (current.value == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void print() {

        Node current = head;

        while (current != null) {

            System.out.print(current.value);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.print();

        System.out.println(
                "Contains 20: " + list.contains(20)
        );
    }
}
