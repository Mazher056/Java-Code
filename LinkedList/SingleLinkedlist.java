package LinkedList;

public class SingleLinkedlist {
    private Node head;
    private Node tail;
    public int size;

    public SingleLinkedlist() {
        this.size = 0;
    }

    //    private Node class (user defined)
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    public void setSize(int size) {
        this.size = size;
    }


    public void inserAtFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
        if (tail == null) {
            tail = newnode;
        }
        size++;
    }

    public void insertAtlast(int value) {
        Node newnode = new Node(value);
        tail.next = newnode;
        tail = newnode;
        if (head == null) {
            head = newnode;
        }
        size++;
    }

    public void insertAtindex(int value, int index) {
        if (index == size) {
            insertAtlast(value);
            return;
        }
        if (index == 0) {
            inserAtFirst(value);
            return;
        }
        if (index > size) {
            System.out.println("ENTER CORRECT INDEX");
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node newnode = new Node(value, temp.next);
            temp.next = newnode;
            return;
        }
    }


    public int deleteatParticularIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        if (index >= size) {
            System.out.println("Enter Correct Index");
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node deletionNode = temp.next;
            temp.next = deletionNode.next;
            return deletionNode.value;
        }
        return 0;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) tail = null;
        return value;
    }

    public int deleteLast() {
        Node temp = head;
        int value;
        if (size <= 1) {
            return deleteFirst();
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            value = tail.value;
            tail = temp;
            tail.next = null;
        }
        return value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }


}
