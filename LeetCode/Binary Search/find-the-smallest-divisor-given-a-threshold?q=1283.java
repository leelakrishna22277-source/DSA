// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold?q=1283


class Solution {
    public static boolean isPossible(int[] nums,int threshold,int k ){
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            c=nums[i]/k;
            if(nums[i]%k!=0){
                c++;
            }
            threshold-=c;
            if(threshold<0){
                return false;
            }
            
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
                int n=nums.length;

        for(int i=0;i<n;i++){
           max=Math.max(nums[i],max);
        }
        int l=1;
        int r=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,threshold,mid)==true){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
       return l;
    }
}
