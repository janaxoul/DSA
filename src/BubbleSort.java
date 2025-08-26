public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={56, 34,12,3,43, 67,53, 223, 54, 44, 5, 0};
        int size= nums.length;
        System.out.println("Before sorting");
        for (int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
        for (int i=0;i<size;i++){
            for (int j=0;j<size-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting");
        for (int num: nums){
            System.out.print(num+" ");
        }
    }
}
