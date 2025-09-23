package arrays;

public interface ArrayADT<T> {
    void insert(int index,T value);
    void append(T value);
    void delete(int index);
    T get(int index);
    void set(int index, T value);
    int size();
    boolean contains(T value);
    void display();
    int indexOf(T value);
    int LastIndexOf(T value);
    boolean isEmpty();
    double sum();
    double average();
    void reverse();
    void insertInSorted(T value);
    boolean isSorted();
    void reArrange();


}