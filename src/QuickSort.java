public class QuickSort {
    public static void main(String[] args) {
        int[] arr={56, 34,12,3,43, 67,53, 223, 54, 44, 5, 0};
        int n= arr.length;
        quicksort(arr, 0, n - 1);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    public static int partition(int[] arr, int low, int high){
        int i= low-1;
        for (int j=low;j<=high;j++){
            if (arr[j]<arr[high]){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void quicksort(int[] arr, int low, int high){
        if (low<high){
            int pi= partition(arr, low, high);

            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
}
