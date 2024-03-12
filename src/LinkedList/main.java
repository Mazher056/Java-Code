package LinkedList;

public class main {
//    public static void main(String[] args) {
//        SingleLinkedlist list = new SingleLinkedlist();
//        list.inserAtFirst(23);
//        list.inserAtFirst(22);
//        list.inserAtFirst(21);
//        list.inserAtFirst(25);
////        list.insertAtlast(0);
////        list.insertAtindex(100,5);
////        list.insertAtlast(81);
////        list.display();
////        System.out.println(list.deleteFirst());
////        System.out.println(list.deleteLast());
//        System.out.println(list.deleteatParticularIndex(3));
//        list.display();
//    }


//    public static void main(String[] args) {
//        DoubleLinkedlist list = new DoubleLinkedlist();
//        list.insertFirst(34);
//        list.insertFirst(12);
//        list.insertLast(1);
//        list.insertLast(10);
//        list.insertLast(65);
//        list.insertafterAnelement(99, 65);
//        list.display();
//    }

    public static void main(String[] args) {
        CircularLinkedlist list =new CircularLinkedlist();
        list.insertFirst(3);
        list.insertFirst(32);
        list.insertFirst(326);
        list.insertFirst(3262);
        System.out.println( list.delete(32));
        list.display();

    }
}
