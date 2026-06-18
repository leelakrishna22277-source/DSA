// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] temp=new int[2];
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(hm.containsKey(complement)){
                  temp[0]=hm.get(complement);
                  temp[1]=i;
                  return temp;
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};

    }
}
