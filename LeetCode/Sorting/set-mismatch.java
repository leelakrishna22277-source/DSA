// https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {
          HashSet<Integer> hs=new HashSet<>();
        
         int duplicate=-1;
         int missing=-1;
         int[] temp=new int[2]; 
         for(int i=0;i<nums.length;i++){
             if(!hs.contains(nums[i])){
                 hs.add(nums[i]);
             }else{
                 duplicate=nums[i];
             }
         }
         int n=nums.length;
         for(int i=1;i<=n;i++){
             if(!hs.contains(i)){
                 missing=i;
             }
         }
         temp[0]=duplicate;
         temp[1]=missing;
         return temp;
    }
}
