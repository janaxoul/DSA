package arrays;

public class MainArray {
    public static void main(String[] args) {
        MyArray<Integer> arr= new MyArray<>(5);
        arr.append(20);
        arr.insert(1,5);
        arr.insert(1,17);
        arr.insert(2,26);
        arr.delete(2);
        arr.set(2,45);
        arr.append(20);
        arr.append(17);
        System.out.println("first index of 20 is "+arr.indexOf(20));
        System.out.println("last index of 20 is "+arr.LastIndexOf(20));
        System.out.println(arr.get(2));
        System.out.println(arr.contains(45));
        System.out.println(arr.size());
        System.out.println("-----");
        arr.display();
    }
}
