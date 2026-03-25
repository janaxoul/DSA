package recursion;
import java.util.*;
public class CountAllSubSequenceWithSumK {

    private static int countSubsequence(int i, int sum, int[] nums) {
        if(sum==0){
            return 1;
        }
        if(sum<0 ||i==nums.length){
            return 0;
        }
        return countSubsequence(i+1, sum-nums[i], nums) + countSubsequence(i+1, sum, nums);
    }

    public static void main(String[] args) {
        int[] nums= {4, 2, 10, 5, 1, 3};
        int sum= 5;
        int count=0;
        System.out.println(countSubsequence(0, sum, nums));


    }

}
