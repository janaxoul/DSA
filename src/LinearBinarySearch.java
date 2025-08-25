
public class LinearBinarySearch {
    public static void main(String[] args) {
        int[] nums={2,3,4,6,7,8,10,13,12,27};
        int target = 10;
        int result1=linearSearch(nums, target);
        int result2=binarySearch(nums, target, 0, nums.length-1);
        if (result2!= -1)
            System.out.println("Element found at Index: "+result2);
        else
            System.out.println("Element not found");
    }

    private static int binarySearch(int[] nums, int target, int left, int right) {
//        int left=0;
//        int right= nums.length;

        if (left<= right){
            int mid= (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                return binarySearch(nums, target, mid+1, right);
            }
            else
                return binarySearch(nums, target, left, mid-1);
        }
//        while (left<= right){
//            steps++;
//            int mid= (left+right)/2;
//            if (nums[mid]==target){
//                System.out.println(steps+ " taken in Linear");
//                return mid;
//            }
//            else if(nums[mid]<target){
//                left=mid+1;
//            }
//            else
//                right=mid-1;
//        }
        return -1;
    }

    public static int linearSearch(int[] nums, int target) {
        int steps=0;
        for(int i=0; i<nums.length; i++){
            steps++;
            if(nums[i]== target){
                System.out.println(steps+ " taken in Linear");
                return i;
            }
        }
        return -1;
    }
}