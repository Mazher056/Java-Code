package LinkedList;

public class LinkedListQues {
    private Node head;
    private Node tail;
    private  int size;


    public void printsize(){
        System.out.println(size);
    }
    LinkedListQues() {
        this.size = 0;
    }


    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            size++;
            return;
        }
        temp.next = head;
        size++;
        head = temp;
        return;
    }

    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        else {
            Node temp = head;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            size++;
            Node newnode = new Node(value);
            temp.next = newnode;
        }
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }


    public void insertwithrecursion(int value, int index) {
        head = InsertWR2(value, index, head);
    }

    private Node InsertWR2(int value, int index, Node currentnode) {
        if (index == 0) {
            Node temp = new Node(value);
            temp.next = currentnode;
            size++;
            return temp;
        }
        currentnode.next = InsertWR2(value, index - 1, currentnode.next);
        return currentnode;
    }

//    LINKEDLIST MERGESORT
    public void mergeSort(){
        mergedivider(0,size);
    }
    private void mergedivider(int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergedivider(low,mid);
            mergedivider(mid+1,high);
            merger(low,mid,high);
        }
    }
    private void merger(int low,int mid,int high){
        LinkedListQues list = new LinkedListQues();

    }

//    public static void bubblesort(LinkedListQues list) {
//        Node front = list.head.next;
//        Node back = list.head;
//        while (front != null) {
//
//        }
//    }

//    public static int HappyNumber(int n) {
//        int slow = n;
//        int fast = n;
//        do{
//            slow = returnsquareofNumber(n);
//            fast = returnsquareofNumber(returnsquareofNumber(n));
//            if(slow ==1||fast==1){
//                return 1;
//            }
//        }while(slow!= fast);
//        return 0;
//    }
//
//    private static int returnsquareofNumber(int n) {
//        int returnnumber = 0;
//        while (n > 0) {
//            int r = n % 10;
//            returnnumber +=(r*r) ;
//            n = n / 10;
//        }
//       return returnnumber;
//    }

    public static LinkedListQues mergetwolist(LinkedListQues list1, LinkedListQues list2) {

        Node temp1 = list1.head;
        Node temp2 = list2.head;
        LinkedListQues anslist = new LinkedListQues();
        while (temp1 != null && temp2 != null) {

            if (temp1.value > temp2.value) {
                anslist.insertLast(temp2.value);
                temp2 = temp2.next;
            } else {
                anslist.insertLast(temp1.value);
                temp1 = temp1.next;
            }
        }
        while (temp1 != null) {
            anslist.insertLast(temp1.value);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            anslist.insertLast(temp2.value);
            temp2 = temp2.next;
        }
        return anslist;
    }

    public void Removedublicate() {

        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }
}
