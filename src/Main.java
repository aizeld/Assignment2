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
        mylist.add(4);
        mylist.add(43);
        mylist.add(433);
        mylist.add(2);
        mylist.sortit();
        System.out.println("sorted list: " );
        for(int i = 0; i < mylist.size(); i++) {System.out.print(mylist.get(i) + " ");}


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
        list.add(667, 2);
        System.out.println("2 index number " + list.get(2));

        list.clear();
        System.out.println("size of the list after clearing " + list.size());







        ////////// DEFENCE

        int m = SumOfDigits.Sum(1356);
        System.out.println(m);
    }
}