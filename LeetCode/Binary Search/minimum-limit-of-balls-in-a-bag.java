// https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/


class Solution {
    public boolean isPossible(int[] nums, int maxOperations,int k){
    
      for(int i=0;i<nums.length;i++){
            int temp=0;
            if(nums[i]>k){
                temp=nums[i]/k;
                if(nums[i]%k!=0){
                    temp++;
                }
                temp--;
                maxOperations-=temp;
            }
        }
        if(maxOperations<0){
            return false;
        }
       return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,maxOperations,mid)==true){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
