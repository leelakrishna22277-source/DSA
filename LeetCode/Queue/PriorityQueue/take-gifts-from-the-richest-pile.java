https://leetcode.com/problems/take-gifts-from-the-richest-pile/


class Solution {
    public long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }

        while(k>0){
            int var=pq.poll();
            double val1=Math.sqrt(var);
            int val2=(int)Math.floor(val1);
            pq.add(val2);
            k--;
        }
        long sum=0;
       for(int n:pq){
           sum+=n;
       }
        return sum;
    }
}
