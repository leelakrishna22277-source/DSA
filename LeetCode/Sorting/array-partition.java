// https://leetcode.com/problems/array-partition/

class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
       Arrays.sort(nums);
       int min=0;
        int i=0;
       while(i<=n-2){
           min+=Math.min(nums[i],nums[i+1]);
           i+=2;
       }
       return min;
    }
}
