package LinkedList;

public class CircularLinkedlist {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public int delete(int value) {
        Node temp = head;
        int rt;
        if (head.value == value) {
            rt = head.value;
            head = head.next;
            tail.next = head;
            return rt;
        } else {
            do {
                if (temp.next.value == value) {
                    rt = temp.next.value;
                    temp.next = temp.next.next;
                    return rt;
                }
                temp = temp.next;

            } while (temp != head);
        }
        return -1;
    }


    public void insertFirst(int value) {
        Node newnode = new Node(value);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.next = head;
        head = newnode;
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        while (temp != head);
    }
//    public void insert()
}
