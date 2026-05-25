// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        
    //    int n=nums.length;
    //    HashMap<Integer,Integer> hm=new HashMap<>();
    //    int maxval=-1;
    //    for(int i=0;i<n;i++){
    //          hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    //    }
    //    for(int i=0;i<n;i++){
    //      if(hm.get(nums[i])>n/2){
    //         // maxval=nums[i];
    //         // break;
    //         return nums[i];
    //      }
    //        }
    int n=nums.length;
       int maxval=-1;
       Arrays.sort(nums);
       maxval=nums[n/2];
           return maxval;
           
    }

}
