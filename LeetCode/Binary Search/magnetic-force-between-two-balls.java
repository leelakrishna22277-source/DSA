// https://leetcode.com/problems/magnetic-force-between-two-balls/


class Solution {
    public boolean isPossible(int[] position,int m,int force){
         Arrays.sort(position);
         int n=position.length;
         int prev=position[0];
         m-=1;
         for(int i=1;i<n;i++){
            int val=position[i];
            if(val-prev>=force){
                m-=1;
                prev=val;
            }
           if(m<=0){
            return true;
            }
            
        }
         
            return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(position,m,mid)==true){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }
}
