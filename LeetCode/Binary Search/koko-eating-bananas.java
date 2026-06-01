// https://leetcode.com/problems/koko-eating-bananas/

class Solution {
    public boolean isValidEatingSpeed(int[] piles,int h,int k){
        int n=piles.length;
        int temp=0;
        for(int i=0;i<n;i++){
            temp=piles[i]/k;
            if(piles[i]%k!=0){
                temp+=1;
            }
            h-=temp;
            if(h<0){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int n=piles.length;
        int l=1;
        int r=(int)Math.pow(10,9);
    
        while(l<=r){
        int mid=l+(r-l)/2;
        
            if(isValidEatingSpeed(piles,h,mid)==true){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        
       }
        return l;
    }
}
