// https://leetcode.com/problems/maximum-candies-allocated-to-k-children/

class Solution {
    public boolean isPossible(int[] candies, long k,int num){
        for(int i=0;i<candies.length;i++){
            int res=0;
            if(candies[i]>=num){
                res=candies[i]/num;
                k-=res;
            }
            if(k<=0){
                return true;
            }
       
        }
        return false;

    }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=(int)Math.pow(10,7);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(candies,k,mid)==true){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }
}
