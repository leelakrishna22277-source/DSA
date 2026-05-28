// https://leetcode.com/problems/binary-subarrays-with-sum/

class Solution {
    public int atmost(int[] nums,int goal){
        if(goal < 0){
            return 0;
        }
        int n=nums.length;
        int l=0;
        int ans=0;
        int temp=0;
        for(int r=0;r<n;r++){
            temp+=nums[r];
            while(temp>goal){
                temp-=nums[l];
                
                l++;
            }
               
            ans+=r-l+1;
            
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int finalans=atmost(nums,goal)-atmost(nums,goal-1);
        
            return finalans;
    }
}
