package arrays;

public class MyArray<T extends Number> implements ArrayADT<T> {
    private Object[] data;
    private int length;
    public MyArray(int capacity){
        data= new Object[capacity];
        length=0;
    }
    public void swap(Object[] arr, int a, int b){
        T temp= (T) arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
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
        if(index>=length || index<0)
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
        for (int i = 0; i < length; i++) {
            if (value != null && value.equals(data[i]))
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
            if(value != null && value.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int LastIndexOf(T value) {
        for(int i=length-1; i>=0;i--){
            if(value != null && value.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    public double sum() {
        double total = 0.0;
        for (int i = 0; i < length; i++) {
            total += ((T) data[i]).doubleValue();
        }
        return total;
    }

    @Override
    public double average() {
        if(length<0 || length==0){
            return 0;
        }
        double total=sum()/length;
        return total;
    }

    @Override
    public void reverse() {
        for(int i=0, j=length-1;i<j;i++, j--){
            Object temp= data[i];
            data[i]= data[j];
            data[j]= temp;
        }
    }

    @Override
    public void insertInSorted(T value) {
        int i= length-1;
        if(length == data.length){
            return;
        }
        while(i>=0 && ((T)data[i]).doubleValue()>value.doubleValue()){
            data[i+1]=data[i];
            i--;
        }
        data[i+1]=value;
        length++;
    }

    @Override
    public boolean isSorted() {
        for(int i=0; i<length-1;i++){
            if(((T)data[i]).doubleValue()>((T)data[i+1]).doubleValue()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void reArrange() {
        int i=0, j=length-1;
        while (i<j){
            while(((T)data[i]).doubleValue()<0)
                i++;
            while(((T)data[j]).doubleValue()>0)
                j--;
            if(i<j) {
                swap(data, i, j);
                i++;
                j--;
            }
        }
    }


}
