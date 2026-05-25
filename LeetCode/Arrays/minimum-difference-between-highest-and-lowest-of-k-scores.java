//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/

class Solution {
    public int minimumDifference(int[] nums, int k) {
       int n=nums.length;
       int dif=Integer.MAX_VALUE;
       Arrays.sort(nums);
      
       for(int i=0;i<n-k+1;i++){
           int j=i+k-1;
           int curdif=nums[j]-nums[i];
           dif=Math.min(curdif,dif);
       }
       
       return dif;
    }
}
