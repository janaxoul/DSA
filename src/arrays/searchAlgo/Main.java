package arrays.searchAlgo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={2,5,6,7,9,11,21,35,37,42,51,77,88,89,90,100};
        Search src= new Search();
        System.out.println(src.binarySearch(0, arr.length,100, arr));
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
