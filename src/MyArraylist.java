public class MyArraylist<T> implements MyList<T> {
private Object[] hiddenArr;
private int length;

public MyArraylist(){
    hiddenArr = new Object[10];
    length = 0;
}

    @Override
    public void add(T element) {
    if(length == hiddenArr.length){
        Object[] new_elements = new Object[hiddenArr.length * 2]; /// created double size

        for(int i = 0; i<hiddenArr.length; i++){
            new_elements[i] = hiddenArr[i];
        }
        hiddenArr = new_elements;


    }
    hiddenArr[length] = element;
    length++;
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
