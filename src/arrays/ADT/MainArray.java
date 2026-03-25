package arrays.ADT;

import java.math.BigDecimal;

public class MainArray {
    public static void main(String[] args) {
        MyArray<Long> arr= new MyArray<>(10);
//        arr.append(1);
//        arr.insert(1,27);
//        arr.insert(1,-17);
//        arr.insert(2,20);
//        arr.append(-12);
//        arr.append(-22);
////        arr.delete(2);
////        arr.set(2,45);
////        arr.append(20);
////        arr.append(17);
////        System.out.println("first index of 20 is "+arr.indexOf(20));
////        System.out.println("last index of 20 is "+arr.LastIndexOf(20));
////        System.out.println(arr.get(2));
////        System.out.println(arr.contains(45));
////        System.out.println(arr.size());
//        arr.display();
//        System.out.println("-----");
//        arr.reArrange();
//        System.out.println("-----");
////        System.out.println(arr.isSorted());
//        System.out.println("-----");
//        arr.display();
        arr.append(20L);
        arr.append(24L);
        arr.append(23L);
        arr.append(21L);
        arr.display();



    }
}
