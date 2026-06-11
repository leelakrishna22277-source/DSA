// https://leetcode.com/problems/sort-characters-by-frequency/

class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Freq> pq=new PriorityQueue<>((a,b)->b.num-a.num);
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            Freq f=new Freq(entry.getKey() ,entry.getValue());
         pq.add(f);
}
          
          while(!pq.isEmpty()){
          Freq temp=pq.poll();
          int count=temp.num;
          int i=0;
          while(i<count){
              ans.append(temp.c);
              i++;
          }
              
          }
          return ans.toString();
    }
}

class Freq{
    char c;
    int num;
    Freq(char c,int num){
        this.c=c;
        this.num=num;
    }
}
