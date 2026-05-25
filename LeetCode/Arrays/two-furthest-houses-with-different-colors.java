// https://leetcode.com/problems/two-furthest-houses-with-different-colors/

class Solution {
    public int maxDistance(int[] colors) {

         int n=colors.length;
        int maxdist1=0;
        int maxdist2=0;
        int maxdist;
        int first=colors[0];
        int second=colors[n-1];
      for(int i=colors.length-1;i>=0;i--){
        if(colors[i]!=first){
            int dist1=Math.abs(i-0);
            maxdist1=Math.max(dist1,maxdist1);
            break;
        }
    }
    for(int i=0;i<n;i++){
        if(colors[i]!=second){
            int dist2=Math.abs((n-1)-i);
            maxdist2=Math.max(dist2,maxdist2);
            break;
        }
    }
    
        return  Math.max(maxdist1,maxdist2);
        
    }
}
