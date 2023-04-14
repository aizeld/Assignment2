public class MyArraylist<T> implements MyList<T> {
private Object[] hiddenArr;
private int length;

public MyArraylist(){
    hiddenArr = new Object[10];
    length = 0;
}

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
