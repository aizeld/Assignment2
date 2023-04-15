public interface MyList<T>{
    void add(T element);
    T get(int index);
    void remove(int index);
    int size();
    boolean contains(Object o);
    void add(T element, int index);
    void clear();
    int indexOf(Object o);

    void sort();
    boolean remove(T element);
}
