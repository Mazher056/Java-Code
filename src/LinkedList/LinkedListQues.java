package LinkedList;

public class LinkedListQues {
    private Node head;
    private Node tail;
    private int size;

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

    public void insertatlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            size++;
            head = newnode;
            tail = newnode;
            return;
        } else {
            size++;
            tail.next = newnode;
            tail = newnode;
            return;
        }

    }

    //    private Node getprevious(Node slow){
//
//    }
    public void bubblesort() {
        bubblesortinsider(size - 1, 0, head, head.next);
        //System.out.println(size-1);
    }

    private void bubblesortinsider(int r, int c, Node slow, Node fast) {
        Node prev = head;
        if (r < 0) return;
        if (c < r) {
            if (slow.value > fast.value) {
                if (slow == head) {
                    head = fast;
                    slow.next = fast.next;
                    fast.next = slow;
                } else {
                    System.out.println("1");
                    while (prev.next != slow) prev = prev.next;
                    prev.next = slow.next;
                    slow.next = fast.next;
                    fast.next = slow;
                    if (fast == tail) {
                        tail = slow;
                    }
                }
                bubblesortinsider(r, c + 1, slow, fast.next.next);

            } else {
                System.out.println("2");
                bubblesortinsider(r, c + 1, slow.next, fast.next);
            }
        } else {
            bubblesortinsider(r - 1, 0, head, head.next);
        }

    }

    public void display() {
        if (head == null) {
            System.out.println("Head is null");
            return;
        } else {
            Node newnode = head;
            while (newnode != null) {
                System.out.print(newnode.value + " ");
                newnode = newnode.next;
            }
        }
//System.out.println("size"+size);
    }

    public void insertWithRecurssion(int data, int index) {
        if (index > size) {
            System.out.println("Index out of bond");
            return;
        } else if (index == 0) {//in recursioninsert1 this else if is not required
            Node newnode = new Node(data);
            newnode.next = head;
            size++;
            head = newnode;
        } else {
            Node currentnode = head;
//            recursioninsert(data, index, 0, currentnode);
            head = recursioninsert1(data, index, currentnode);
        }
    }

    public Node recursioninsert1(int data, int index, Node currentnode) {
        if (index == 0) {
            Node newnode = new Node(data);
            newnode.next = currentnode;
            return newnode;
        } else {
            currentnode.next = recursioninsert1(data, index - 1, currentnode.next);
        }
        return currentnode;
    }

    private void recursioninsert(int data, int index, int tindex, Node currentnode) {
        if (tindex == index - 1) {
            Node newnode = new Node(data);
            newnode.next = currentnode.next;
            currentnode.next = newnode;
            size++;
            return;
        } else {
            recursioninsert(data, index, tindex + 1, currentnode.next);
        }
    }

    public void removeDublicate() {
        //1 1 1,2 2 3 4 4 4 ---> (1 2 3 4)
        Node slow = head;
        Node fast = head;
        while (slow.next != null) {
            if (fast.next.value == slow.value) {
                while (fast.value == slow.value) {
                    fast = fast.next;
                    if (fast == null) {
                        slow.next = fast;
                        return;
                    }
                }
                slow.next = fast;
                slow = fast;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
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

    public static int findHappnumber(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = squareadd(slow);
            fast = squareadd(squareadd(fast));
            if (slow == 1 || fast == 1) {
                System.out.println("It is a happy number");
                return 1;
            }
        } while (fast != slow);
        System.out.println("Not a happy number");
        return -1;
    }

    public static int squareadd(int n) {
        int t = 0, r = 0;
        while (n > 0) {
            r = n % 10;
            t += (r * r);
            n = n / 10;
        }
        return t;
    }


//    public static void main(String[] args){
//        findHappnumber(45);
//    }


    public Node merger(Node left, Node right) {
        Node result = null;
        if (left == null) return right;
        if (right == null) return left;
        if (left.value < right.value) {
            result = left;
            result.next = merger(left.next, right);
        } else {
            result = right;
            result.next = merger(left, right.next);
        }
        return result;
    }

    public Node middle(Node mhead) {
//        if(mhead==null) return mhead;
        Node slow = mhead;
        Node fast = mhead;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort1(Node mhead) {
        if (mhead == null || mhead.next == null) return mhead;
        Node mid = null;
        Node midnext = null;
        mid = middle(mhead);
        midnext = mid.next;
        mid.next = null;
        Node left, right;
        left = mergeSort1(mhead);
        right = mergeSort1(midnext);
        return merger(left, right);
    }


    public void mergeSort(LinkedListQues list) {
        head = mergeSort1(list.head);
    }


    //REVERSING LINKED LIST
    public void reverse() {
        Node fast = head, slow = head, p = null;
        while (fast.next != null) {
            if (fast == head) {
                p = fast.next;
                tail = head;
                fast.next = null;
            }
            fast = p;
            if (fast.next == null) {
                fast.next = slow;
                head = fast;
                return;
            }
            p = p.next;
            fast.next = slow;
            slow = fast;
        }

    }

    //REVERSING LINK LIST USING RECURSION
    public void linklistreversalusingrecursion() {
        linklistreversalusingrecursionInternalImplementation(head);
    }

    public void linklistreversalusingrecursionInternalImplementation(Node temp) {
        if (temp.next == null) {
            head = temp;
            return;
        }
        linklistreversalusingrecursionInternalImplementation(temp.next);
        tail.next = temp;
        tail = temp;
        tail.next = null;
    }


    public void reversewithinrange(int l, int r) {
        reverseWIR(head, l, r);
    }

    private void reverseWIR(Node head, int l, int r) {
        if (r == l) return;
        Node current = head;
        Node last = null;
        Node startnode = null;
        Node prev = null;
        Node newnode = null;
        for (int i = 0; i < l; i++) {
            last = prev;
            prev = current;
            current = current.next;
        }
        startnode = last;
        newnode = prev;

        for (int i = 0; i < (r - l); i++) {
            last = prev;
            prev = current;
            current = current.next;
            prev.next = last;
        }
        if (last == null) {
            newnode.next = current;
            prev = head;
        } else
            startnode.next = prev;
    }

    public void reOrder() {
        reorderList(head);
    }

    public void reorderList(Node head) {
        if (head.next == null) return;
        Node mid = reverse(head);
        //System.out.println(mid.next.value);


        Node temp = head;
        Node temp2;
        Node prev = mid;
        Node prev2;
        while (temp != mid) {
            temp2 = temp.next;
            prev2 = prev.next;
            temp.next = prev;

            if (temp2 == mid) {
                prev.next = prev2;
                return;
            } else {
                prev.next = temp2;
                temp = temp2;
                prev = prev2;
            }
        }
    }

    public Node reverse(Node head) {
        Node slow = head, fast = head, startnode = null;
        while (fast != null && fast.next != null) {
            startnode = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        Node current = slow;
        Node next = current.next;
        Node prev = null;
        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {

                next = next.next;
            }
        }
        startnode.next = prev;
        return prev;
    }


    public void reOrderwithKthpositon(int k) {
        Node nn = head;
        Node startnode = null;
        Node prev = null;
        Node ch;
        Node currentTail=null;
        while (nn != null) {
            prev = startnode;
            startnode = nn;
            for (int i = 0; i < k; i++) {
                if (nn.next == null) {
                    // break;
                    return;
                }
                currentTail = nn;
                nn = nn.next;
            }
            currentTail.next = null;

            ch = reverseforKth(startnode);



            if (prev != null) prev.next = ch;
            else {
                head = ch;
            }
            startnode.next = nn;
        }
        //  return head;
    }

    private Node reverseforKth(Node temp) {
        Node current = temp;
        Node next = current.next;
        Node prev = null;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }


}


//public class LinkedListQues {
//    private Node head;
//    private Node tail;
//    private int size;
//
//
//    public void printsize() {
//        System.out.println(size);
//    }
//
//    LinkedListQues() {
//        this.size = 0;
//    }

//    private class Node {
//        int value;
//        Node next;
//
//        Node(int value) {
//            this.value = value;
//        }
//    }
//
//    public void insertFirst(int value) {
//        Node temp = new Node(value);
//        if (head == null) {
//            head = temp;
//            size++;
//            return;
//        }
//        temp.next = head;
//        size++;
//        head = temp;
//        return;
//    }
//
//    public void insertLast(int value) {
//        if (head == null) {
//            insertFirst(value);
//            return;
//        } else {
//            Node temp = head;
//            for (int i = 1; i < size; i++) {
//                temp = temp.next;
//            }
//            size++;
//            Node newnode = new Node(value);
//            temp.next = newnode;
//        }
//    }
//
//    public void display() {
//        Node temp = head;
//        if (head == null) {
//            return;
//        }
//        while (temp != null) {
//            System.out.print(temp.value + " ");
//            temp = temp.next;
//        }
//    }
//
//
//    public void insertwithrecursion(int value, int index) {
//        head = InsertWR2(value, index, head);
//    }
//
//    private Node InsertWR2(int value, int index, Node currentnode) {
//        if (index == 0) {
//            Node temp = new Node(value);
//            temp.next = currentnode;
//            size++;
//            return temp;
//        }
//        currentnode.next = InsertWR2(value, index - 1, currentnode.next);
//        return currentnode;
//    }
//
//    //    LINKEDLIST MERGESORT
//    public void mergeSort() {
//        mergedivider(0, size);
//    }
//
//    private void mergedivider(int low, int high) {
//        if (low < high) {
//            int mid = (low + high) / 2;
//            mergedivider(low, mid);
//            mergedivider(mid + 1, high);
//            merger(low, mid, high);
//        }
//    }
//
//    private void merger(int low, int mid, int high) {
//        LinkedListQues list = new LinkedListQues();
//
//    }
//
////    public static void bubblesort(LinkedListQues list) {
////        Node front = list.head.next;
////        Node back = list.head;
////        while (front != null) {
////
////        }
////    }
//
////    public static int HappyNumber(int n) {
////        int slow = n;
////        int fast = n;
////        do{
////            slow = returnsquareofNumber(n);
////            fast = returnsquareofNumber(returnsquareofNumber(n));
////            if(slow ==1||fast==1){
////                return 1;
////            }
////        }while(slow!= fast);
////        return 0;
////    }
////
////    private static int returnsquareofNumber(int n) {
////        int returnnumber = 0;
////        while (n > 0) {
////            int r = n % 10;
////            returnnumber +=(r*r) ;
////            n = n / 10;
////        }
////       return returnnumber;
////    }
//
//    public static LinkedListQues mergetwolist(LinkedListQues list1, LinkedListQues list2) {
//
//        Node temp1 = list1.head;
//        Node temp2 = list2.head;
//        LinkedListQues anslist = new LinkedListQues();
//        while (temp1 != null && temp2 != null) {
//
//            if (temp1.value > temp2.value) {
//                anslist.insertLast(temp2.value);
//                temp2 = temp2.next;
//            } else {
//                anslist.insertLast(temp1.value);
//                temp1 = temp1.next;
//            }
//        }
//        while (temp1 != null) {
//            anslist.insertLast(temp1.value);
//            temp1 = temp1.next;
//        }
//        while (temp2 != null) {
//            anslist.insertLast(temp2.value);
//            temp2 = temp2.next;
//        }
//        return anslist;
//    }
//

//}
