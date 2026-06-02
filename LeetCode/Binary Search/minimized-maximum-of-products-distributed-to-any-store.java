// https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/

class Solution {
     public static boolean isPossibleWithDistribution(int[] quantities ,int shops,int capacity){
        int n=quantities.length;
        int sum=0;
         for(int i=0;i<n;i++){
             sum=quantities[i]/capacity;
             if(quantities[i]%capacity!=0){
                 sum++;
             }
             shops-=sum;
             }
             if(shops<0){
                 return false;
             }
             return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
       int r=Integer.MAX_VALUE;
       while(l<=r){
           int mid=l+(r-l)/2;
           if(isPossibleWithDistribution(quantities,n,mid)==true){
            r=mid-1;
           }
           else{
            l=mid+1;
           }
           
       }
       return l;
    }
}
