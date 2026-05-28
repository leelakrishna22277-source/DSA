// https://leetcode.com/problems/count-number-of-nice-subarrays/



class Solution {
    public int atmost(int nums[],int k){
        int n=nums.length;
        int l=0;
        int sum=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if(nums[r]%2==1){
                sum++;
            }
           while(sum>k){
               if(nums[l]%2==1){
                   sum--;
               }
               l++;
           }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {

        int ans1=atmost(nums,k)-atmost(nums,k-1);
        return ans1;
        
    }
}
