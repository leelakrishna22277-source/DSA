// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

class Solution {
    public boolean isPossibleDays(int[] bloomDay, int m, int k,int day){
         int n=bloomDay.length;
          int took=0;
          for(int i=0;i<n;i++){
              if(bloomDay[i]<=day){
                  took+=1;
              }else{
                  took=0;
              }
              if(took==k){
                  m-=1;
                  took=0;
              }
         if(m==0){
             return true;
        }
          }
             return false;

         
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossibleDays(bloomDay,m,k,mid)==true){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l==(int)Math.pow(10,9)+1){
            return -1;
        }
        return l;
        
    }
}
