package arrays.searchAlgo;

public class Search {

    public void swap(int [] arr, int a, int b){
        int temp= arr[a];
        arr[b]=arr[a];
        arr[a]= temp;
    }
    public int LinearSearch(int[] arr, int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key && i > 0){
                swap(arr, i, i-1);
                return i-1;
            }
        }
        return -1;
    }
    public int binarySearch(int l, int r, int key, int[] arr){
        if(l<=r){
            int mid= l+(r-l)/2;
            if(key== arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                return binarySearch(l, mid-1, key , arr);
            }
            else{
                return binarySearch(mid+1, r, key, arr);
            }
        }
        return -1;
    }
}
