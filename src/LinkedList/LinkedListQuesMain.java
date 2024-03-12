package LinkedList;

public class LinkedListQuesMain {
    //    public static int HappyNumber(int n) {
//        int slow = n;
//        int fast = n;
//        do{
//            slow = returnsquareofNumber(slow);
//            fast = returnsquareofNumber(returnsquareofNumber(fast));
//            if(slow ==1||fast==1){
//                return 1;
//            }
//        }while(slow!= fast);
//        return -1;
//    }
//
//    private static int returnsquareofNumber(int n) {
//        int returnnumber = 0;
//        while (n > 0) {
//            int r = n % 10;
//            returnnumber +=(r*r) ;
//            n = n / 10;
//        }
//        return returnnumber;
//    }
//    public static int returnsquare(int n){
//        int r,s=0;
//        while(n>0){
//            r =n%10;
//            s+=r*r;
//            n /=10;
//        }
//        return s;
//    }
//    public static int happynumberlogic(int n){
//        int slow= n;
//        int fast= n;
//
//        do{
//            slow = returnsquare(slow);
//            fast = returnsquare(returnsquare(fast));
//            if(slow == 1){
//                return 1;
//            }
//        }while(slow!=fast);
//        return -1;
//    }
    public static void main(String[] args) {
        LinkedListQues list1 = new LinkedListQues();
//        LinkedListQues list2 = new LinkedListQues();
//        LinkedListQues mergelist;
//        list1.insertFirst(4);
//        list1.insertFirst(5);
        list1.insertatlast(1);
        list1.insertatlast(2);
        list1.insertatlast(3);
        list1.insertatlast(4);
        list1.insertatlast(5);
//        list1.insertatlast(6);
//        list1.insertatlast(7);
//        list1.insertatlast(8);
//        list1.insertatlast(9);
//        list1.insertatlast();
//        list1.insertWithRecurssion(102,10);
//        list1.insertWithRecurssion(102,10);
        //list1.display();
        //System.out.println();
        //   list1.bubblesort();
        //list1.mergeSort(list1);
//        list1.removeDublicate();
//        list1.display();
//        System.out.println();
//        list1.reverse();
//        list1.display();
//        list1.linklistreversalusingrecursion();
//        System.out.println();


       // list1.reversewithinrange(3,6);
        list1.display();
//        list1.reOrder();
        System.out.println();
        list1.reOrderwithKthpositon(2);
        list1.display();
//
//
////        list1.bubblesort(list1);
//////        System.out.println(list1.head.value);
////        mergelist = LinkedListQues.mergetwolist(list1,list2);
//////        list.insertFirst(2);
//////        list.insertFirst(1);
//////        list.insertFirst(1);
//////        list.Removedublicate();
//////        list.insertwithrecursion(23,3);
////        mergelist.display();
////        System.out.println(HappyNumber(13));
////        System.out.println(happynumberlogic(13));
//
    }
}
