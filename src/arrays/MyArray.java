package arrays;

public class MyArray<T> implements ArrayADT<T> {
    private Object[] data;
    private int length;
    public MyArray(int capacity){
        data= new Object[capacity];
        length=0;
    }
    public int capacity(){
        return data.length;
    }
    public int size(){
        return length;
    }
    @Override
    public void insert(int index, T value) {
        if(length>=data.length || index<0 ||index>length)
            throw new IndexOutOfBoundsException("Insert Failed");
        for (int i=length; i>index; i--){
            data[i]=data[i-1];
        }
        data[index]=value;
        length++;
    }

    @Override
    public void append(T value) {
        if(length>=data.length)
            throw new IndexOutOfBoundsException("Append failed");
        data[length]=value;
        length++;
    }

    @Override
    public void delete(int index) {
        if(index>length || index<0)
            throw new IndexOutOfBoundsException("Delete failed");
        for(int i=index;i<length-1;i++){
            data[i]=data[i+1];
        }
        length--;
    }

    @Override
    public T get(int index) {
        if(index>=length || index<0)
            throw new IndexOutOfBoundsException("Get failed");
        return (T) data[index];
    }

    @Override
    public void set(int index, T value) {
        if(length>=data.length || index<0 ||index>=length)
            throw new IndexOutOfBoundsException("Setting the data failed");
        data[index]=value;
    }


    @Override
    public boolean contains(T value) {
        for (Object datum : data) {
            if (value != null && value.equals(datum))
                return true;
        }
        return false;
    }

    @Override
    public void display() {
        for(int i=0; i<length;i++){
            System.out.println(data[i]);
        }
    }

    @Override
    public int indexOf(T value) {
        for(int i=0; i<length;i++){
            if(data[i]==value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int LastIndexOf(T value) {
        for(int i=length-1; i>=0;i--){
            if(data[i]==value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }
}
