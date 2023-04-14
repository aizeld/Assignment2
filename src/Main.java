public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyArraylist<Integer> mylist = new MyArraylist<>();

        mylist.add(4); ///just adding some elements
        mylist.add(5);
        mylist.add(7);


        System.out.println("size of list " + mylist.size()); ///3
        System.out.println("element at index 2 is " + mylist.get(2));///7
        mylist.remove(2);
        System.out.println("checking the size after removing " + mylist.size());///2

    }
}