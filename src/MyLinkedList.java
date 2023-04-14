public class MyLinkedList <T> implements MyList<T>{

    private class Node(){
        T element;
        Node next;
        Node previous;
        public Node(T element, Node previous, Node next){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList

    @Override
    public void add(T element) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }
}
