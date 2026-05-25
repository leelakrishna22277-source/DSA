https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        // int count=0;
        // for(int i=0;i<stones.length();i++){
        //     for(int j=0;j<jewels.length();j++){
        //         if(stones.charAt(i)==jewels.charAt(j)){
        //             count+=1;
        //         }
        //     }
        // }
       int count=0;
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<jewels.length();i++){
             
                hm.put(jewels.charAt(i),0);
             
       }
       for(int i=0;i<stones.length();i++){
             if(hm.containsKey(stones.charAt(i))){
                hm.put(stones.charAt(i),hm.getOrDefault(stones.charAt(i),0)+1);
             }
            
       }
      for(char keys:hm.keySet()){
          count+=hm.get(keys);
      }

        return count;
    }
}
