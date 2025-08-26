public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={56, 34,12,3,43, 67,53, 223, 54, 44, 5, 0};

        System.out.println("Before Sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();

        int size= nums.length;
        for(int i=0;i<size-1;i++){
            int min=i;

            for(int j=i+1;j<size;j++){
                if(nums[i]>nums[j]){
                    min=j;
                }
            }
            int temp= nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }

        System.out.println("After Sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
