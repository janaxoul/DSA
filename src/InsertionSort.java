public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={56, 34,12,3,43, 67,53, 223, 54, 44, 5, 0};
        int size= nums.length;
//        System.out.println("Before Sorting");
//        for(int num:nums){
//            System.out.print(num+" ");
//        }
//        System.out.println();
//        int steps=0;

        for (int i=1;i<size;i++){
            int key= nums[i];
            int j=i-1;
            while (j>=0 && nums[j]> key){
//                ++steps;
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
//            System.out.print("Step "+steps+": ");
//            for(int num:nums){
//                System.out.print(num+" ");
//            }
//            System.out.println();
        }
//        System.out.println("After Sorting with "+steps+" steps");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
