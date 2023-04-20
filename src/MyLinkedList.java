public class MyLinkedList <T> implements MyList<T>{

    private class Node {
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

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T element) {

        if(tail == null){ /// если лист пустой
            tail = new Node(element, null ,null);
            head = tail;
        }else{//если нет
            Node newNode = new Node(element, tail, head);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
    if(index < 0 || index >= size){
        throw new IndexOutOfBoundsException();
    }
    Node current;
    if (index < size / 2){
        current = head;
        for(int i =0; i < index; i++){
            current = current.next;
        }
    }else{
        current = tail;
        for(int i = size - 1; i > index; i--){
            current = current.previous;
        }
    }
    return current.element;
    }

    @Override
    public void remove(int index) {
        Node current;
        if(index < size /2 ){
            current = head;
            for(int i = 0 ; i < index; i++){
                current = current.next;
            }
        }else{
            current = tail;
            for(int i = size - 1; i>index; i--) {
                current = current.previous;
            } /// cдесь мы ищем короткий путь чтобы дойти до этого числа
        }
    if(current.previous == null){
        head = current.next; // здесь мы проверяем слева нет ли числа, если есть, то подключаемся к левому
    }else{
        current = current.previous;
    }
    if(current.next == null){
        tail = current.previous; // тоже самое
    }else{
        current = current.next;
    }
    size--; /// исправил баги, чето не грузилось
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }

        return current;
    }


    @Override
    public void add(T element, int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element, null, null);
        if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else {
            Node node = getNode(index);
            newNode.next = node;
            newNode.previous = node.previous;
            node.previous.next = newNode;
            node.previous = newNode;
        }
        size++;




    }

    @Override
    public void clear() {
    head = null;
    tail = null;
    size = 0;
    }

    @Override
    public int indexOf(Object o) {
        Node current = head;
        for(int i = 0; i < size; i++){
            if(current.element.equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {

    }

    @Override
    public boolean remove(T element) {
        return false;
    }
}
