package LinkedList;

public class DoubleLinkedlist {
    private Node head;
    private int size;

    private Node tail;

    public DoubleLinkedlist() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;

        }
    }

    public void insertFirst(int value) {
        Node temp = new Node(value);
        temp.next = head;
        temp.prev = null;
        if (head != null) {
            head.prev = temp;
        }
        size++;
        if (head == null) {
            tail = temp;
        }
        head = temp;
    }

    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
        }
        size++;
        Node newnode = new Node(value);
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }


    public void insertafterAnelement(int value, int element) {
        Node temp = head;
        if (head == null) {
            System.out.println("Head is empty");
            return;
        }
        while (temp != null) {
            if (temp.value == element) {
                if (temp == tail) {
                    insertLast(value);
                    return;
                }
                Node newnode = new Node(value);
                newnode.next = temp.next;
                newnode.prev = temp;
                temp.next.prev = newnode;
                temp.next = newnode;
                size++;
                return;
            }
            temp = temp.next;
        }
    }
}
