// https://leetcode.com/problems/minimum-number-game/


class Solution {
    public int[] numberGame(int[] nums) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] arr=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            pq.add(nums[k]);
        }
        int i=0;
        while(!pq.isEmpty() && i<nums.length){
            int alice=pq.poll();
            int bob=pq.poll();

            arr[i]=bob;
            i++;
            arr[i]=alice;
            i++;
        }
        return arr;
  }
}
