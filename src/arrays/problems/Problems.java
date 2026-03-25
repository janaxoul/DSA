package arrays.problems;

import java.util.*;

public class Problems {
    public static void findMissingInSorted(int[] arr){
        int l=arr[0], h= arr[arr.length-1], n= arr.length;
        int diff= l;
        for(int i=0;i<n;i++){
            if(arr[i]-i!=diff){
                while(diff<arr[i]-i)
                    System.out.println("The missing element is: "+(i+diff++));

            }
        }
    }
    public static void findMissingInUnsorted(int[] arr){
        int l=arr[0], h= arr[arr.length-1], n= arr.length;
        int max=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        int[] hashArray= new int[max+1];
        for(int i=0;i<n;i++){
            hashArray[arr[i]]=1;
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0; i<hashArray.length;i++){
            if(hashArray[i]==0){
                System.out.print(i+" ");
            }
        }
    }
    private static void findDuplicateInSorted(int[] arr) {
        int lastDup=0;
        System.out.print("original Array: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Duplicate elements: ");
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=lastDup){
                System.out.print(arr[i]+" ");
                lastDup=arr[i];
            }
        }
    }
    private static void findDuplicateCountInSorted(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                j=i+1;
                while(arr[i]==arr[j]){
                    j++;
                }
                System.out.println(arr[i]+" is appearing "+(j-i)+"  times");
                i=j-1;
            }
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i); // store current value and its index
        }
        return null;
    }
    public static int maxArea(int[] height) {
        int maxvalue=0;
        for(int i=0, j=height.length-1;i<j;){
            if(height[i]<height[j]){
                int tempMax=(j-i)* height[i];
                if(tempMax>maxvalue)
                    maxvalue=tempMax;
                i++;
            }
            else {
                int tempMax=(j-i)* height[j];
                if(tempMax>maxvalue)
                    maxvalue=tempMax;
                j--;
            }

        }
        return maxvalue;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> posMap= new HashMap<>();
        Map<Integer, Integer> negMap= new HashMap<>();
        int zero=0;
        List<List<Integer>> result=new ArrayList<>();
        //creating the +ve -ve map;
        for(int i: nums){
            if(i<0){
                if(negMap.containsKey(i)){
                    negMap.put(i,negMap.get(i)+1);
                }
                else{
                    negMap.put(i,1);
                }
            }
            else if(i>0){
                if(posMap.containsKey(i)){
                    posMap.put(i,posMap.get(i)+1);
                }
                else{
                    posMap.put(i,1);
                }
            }
            else{
                zero++;
            }
        }

        for(Integer key: negMap.keySet()){
            int posValue= -1*(key);
            int negValue= key;
            int negValueCount=-1*(key*negMap.get(key));
            if(posMap.containsKey(posValue) && zero>0){
                result.add(new ArrayList<>(Arrays.asList(key, 0, posValue)));
                if(zero>0 && nums.length==3){
                    break;
                }
            }
            if(negMap.get(key)>1 && posMap.containsKey(negValueCount)){
                result.add(new ArrayList<>(Arrays.asList(key, key,negValueCount)));
            }
            if(posMap.containsValue(negValueCount) || posMap.containsKey(negValueCount/(-1*key))){
                result.add(new ArrayList<>(Arrays.asList(negValueCount/(-1*key), negValueCount/(-1*key), key)));
            }
        }
        if(zero>2){
            result.add(new ArrayList<>(Arrays.asList(0,0,0)));
        }
        return result;
    }
    public static int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[][] rank = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < preferences[i].length; j++) {
                rank[i][preferences[i][j]] = j;
            }
        }
        int[] pair = new int[n];
        for (int[] p : pairs) {
            pair[p[0]] = p[1];
            pair[p[1]] = p[0];
        }
        Set<Integer> unhappy = new HashSet<>();
        for (int x = 0; x < n; x++) {
            int y = pair[x]; // x is paired with y
            for (int u : preferences[x]) {
                if (rank[x][u] < rank[x][y]) { // x prefers u over y
                    int v = pair[u]; // u is paired with v
                    if (rank[u][x] < rank[u][v]) { // u prefers x over v
                        unhappy.add(x);
                        break; // no need to check further for x
                    }
                } else {
                    break; // once we reach y, stop checking
                }
            }
        }
        return unhappy.size();
    }
    public static int triangleNumber(int[] nums) {
        int count=0;
            for(int i=0;i<nums.length;i++){
                int j=i+1;
                int k=j+1;
                while(j<nums.length && k<nums.length) {
                    if ((nums[i] + nums[j]) > nums[k]) {
//                        System.out.println(count++);
                        count++;
                        k++;
                    }
                    else{
                        j++;
                        k=j+1;
                    }
                }
            }
        return count;
    }
    public static void main(String[] args) {
//        finding element in a sorted array:
//        int[] arr= {6,7,8,9,10,13,14,18};
//        findMissingInSorted(arr);

//        finding element in a unsorted array
//            int [] arr= {3,5,6,0,17,11,15,8};
//            findMissingInUnsorted(arr);

//        find the duplicate element in an array
//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7};
//        findDuplicateInSorted(arr);

//        finding multiple duplicates, and it's count in a sorted array
//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7};
//        findDuplicateCountInSorted(arr);

//        Two sum problem;
//        int [] arr={3,2,4};
//        int [] result= twoSum(arr, 6);

//        max area- container with most water
//        int[] height= {1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(height));

//        Three sum
//        int [] nums= {-1,0,1};
//        System.out.println(threeSum(nums));

//        Unhappy Friends
//        int n=4;
//        int[][] preferences={{1,3,2},{2,3,0},{1,3,0},{0,2,1}};
//        int[][] pairs={{1,3},{0,2}};
//        System.out.println(unhappyFriends(n,preferences,pairs));

//        valid triangle
        int[] nums={2,3,4,4};
        System.out.println(triangleNumber(nums));
    }




}
