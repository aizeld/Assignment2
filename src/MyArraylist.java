import java.util.Arrays;
import java.util.Comparator;

public class MyArraylist<T> implements MyList<T>{
private Object[] hiddenArr;
private int length;

public MyArraylist(){
    hiddenArr = new Object[10];
    length = 0;
}


    private void increaseArray() {
        int biggerSize = (int)(hiddenArr.length * 2);
        Object[] new_elements = new Object[biggerSize];

        for (int i = 0; i < hiddenArr.length; i++) {
            new_elements[i] = hiddenArr[i];
        }

        hiddenArr = new_elements;
    }

    @Override
    public void add(T element) {
    if(length == hiddenArr.length){
        increaseArray();


    }
    hiddenArr[length] = element;
    length++;
    }

    @Override
    public T get(int index) {
        if (index >= length) throw new IndexOutOfBoundsException();

        return (T)hiddenArr[index];
    }

    @Override
    public void remove(int index) {
        if (index >= length) throw new IndexOutOfBoundsException();

        for(int i = index; i < length - 1; i++){
            hiddenArr[i] = hiddenArr[i+1];
        }
        length--;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean contains(Object o) {
        for(int i =0 ; i < length; i++){
           if(hiddenArr[i].equals(o)){
               return true;
           }
        }
        return false;
    }

    @Override
    public void add(T element, int index) {
        if(index > length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(length == hiddenArr.length){
            increaseArray();
        }
        for(int i = length; i > index; i--){
            hiddenArr[i] = hiddenArr[i-1];
        }
        hiddenArr[index] = element;
        length++;
    }

    @Override
    public void clear() {
        hiddenArr = new Object[10];
        length = 0;
    }

    @Override
    public int indexOf(Object o) {
    int i;
    for(i =0; i< length;i++){
            if(hiddenArr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }



    @Override
    public void sort() {
        Arrays.sort(hiddenArr, 0, length);
    }


    public void sortit(){
    for(int i = 0 ; i < length- 1 ; i++){
        for(int j = 0; j < length - i - 1; j ++){
            if(((Comparable<T>) hiddenArr[j]).compareTo((T) hiddenArr[j+1]) > 0){
                toswap(j, j+1);
            }


        }
    }
    }

    private void toswap(int first, int second){
        T temp = (T) hiddenArr[first];
        hiddenArr[first] = hiddenArr[second];
        hiddenArr[second] = temp;
    }

    @Override
    public boolean remove(T element) {
        int index = indexOf(element);
        if(index == -1){
            return false;
        }
        if(index >= length){
            return false;
        }
        for(int i = index; i < length - 1; i++){
            hiddenArr[i] = hiddenArr[i+1];
        }
        length--;
        return true;
    }




}
