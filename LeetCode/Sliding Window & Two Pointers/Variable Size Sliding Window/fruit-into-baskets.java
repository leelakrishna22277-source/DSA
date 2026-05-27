// https://leetcode.com/problems/fruit-into-baskets/

class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        int count=0;
        int baskets=2;
        for(int r=0;r<n;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>baskets){
             hm.put(fruits[l],hm.get(fruits[l])-1);
             if(hm.get(fruits[l])==0){
                hm.remove(fruits[l]);
             }
             l++;


            }
            count=Math.max(count,r-l+1);
        }
        return count;
    }
}
