public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyArraylist<Integer> mylist = new MyArraylist<>();

        mylist.add(4);
        mylist.add(5);
        mylist.add(3);

        System.out.println(mylist.size());

    }
}