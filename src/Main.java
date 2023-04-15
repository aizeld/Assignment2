import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ////////////////ARRAY LIST
        MyArraylist<Integer> mylist = new MyArraylist<>();

        mylist.add(4); ///just adding some elements
        mylist.add(5);
        mylist.add(7);


        System.out.println("size of list " + mylist.size()); ///3
        System.out.println("element at index 2 is " + mylist.get(2));///7
        mylist.remove(2);
        System.out.println("checking the size after removing " + mylist.size());///2

        //////LINKED LIST
        System.out.println("LINKED LIST TEST BELOW");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(234);
        list.add(2554);
        list.add(324234);
        list.add(3);
        System.out.println("size of linked list " + list.size());
        System.out.println("get eleement at index 2 " + list.get(2));
        list.remove(2);
        System.out.println("list size after removing " + list.size());



        int m = SumOfDigits.Sum(156);
        System.out.println(m);
    }
}