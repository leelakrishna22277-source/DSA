// https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
    //       HashMap<Integer,Integer> hm=new HashMap<>();

    //  int goodpair=0;
    //  for(int i=0;i<nums.length;i++){
    //     if(hm.containsKey(nums[i])){
    //         goodpair+=hm.get(nums[i]);
    //         hm.put(nums[i],hm.get(nums[i])+1);
    //     }
    //     else{
    //         hm.put(nums[i],1);
    //     }
    //  }

    HashMap<Integer,Integer> hm=new HashMap<>();
    int goodpair=0;
    for(int i=0;i<nums.length;i++){
        if(hm.containsKey(nums[i])){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        else{
            hm.put(nums[i],0);
        }
    }

    for(int val:hm.keySet()){
        int value=hm.get(val);
        int sum=value*(value+1)/2;
        goodpair+=sum;
    }


     

    return goodpair;
    }
}
