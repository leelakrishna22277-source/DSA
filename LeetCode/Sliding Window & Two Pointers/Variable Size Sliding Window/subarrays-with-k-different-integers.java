// https://leetcode.com/problems/subarrays-with-k-different-integers/

class Solution {
    public int atmost(int[] nums,int k){
         int ans=0;
        int n=nums.length;
        int l=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int r=0;r<n;r++){
            hs.put(nums[r],hs.getOrDefault(nums[r],0)+1);
            while(hs.size()>k){
                hs.put(nums[l],hs.get(nums[l])-1);
                if(hs.get(nums[l])==0){
                    hs.remove(nums[l]);
                    
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
             int finalans=atmost(nums,k)-atmost(nums,k-1);
             return finalans;
        
    }
}
