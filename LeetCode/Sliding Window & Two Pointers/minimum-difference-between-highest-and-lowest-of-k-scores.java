// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
class Solution {
    public int minimumDifference(int[] nums, int k) {
       ArrayList<Integer> al=new ArrayList<>();
       int n=nums.length;
       int dif=Integer.MAX_VALUE;
       Arrays.sort(nums);
      
       int l=0;
       for(int r=0;r<n;r++){
           al.add(nums[r]);
           int curdif=0;
           if(r-l==k){
                al.remove(Integer.valueOf(nums[l]));
               l++;
           }
           if(al.size()==k){
               int max=Collections.max(al);
               int min=Collections.min(al);
               curdif=max-min;
               dif=Math.min(curdif,dif);
           }
       }
       
       return dif;
    }
}
------------------------------------------------------------------------------------------

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
