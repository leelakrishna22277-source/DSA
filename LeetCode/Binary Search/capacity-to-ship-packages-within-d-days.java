// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    public boolean isPossibleWithCapacity(int[] weights, int days, int capacity) {

    int sum = 0;

    for (int i = 0; i < weights.length; i++) {
      int val=weights[i];
      if(val>capacity){
        return false;
      }
       if(sum+val>capacity){
        days-=1;
        sum=0;
       }
       sum+=val;
    }
       if(days<=0){
        return false;
       }
       
     return true;
}
public int shipWithinDays(int[] weights, int days) {
        
        int l=1;
       int r=(int)Math.pow(10,11);
       while(l<=r){
           int mid=l+(r-l)/2;
           if(isPossibleWithCapacity(weights,days,mid)==true){
               r=mid-1;
           }else{
               l=mid+1;
           }
       }
     return l;
    }
}
