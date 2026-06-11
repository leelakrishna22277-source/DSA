// https://leetcode.com/problems/construct-string-with-repeat-limit/


class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {



       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<s.length();i++){
           hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
       }
       
       PriorityQueue<Freq> pq=new PriorityQueue<>((a,b)->b.ch-a.ch);
       for(char ch:hm.keySet()){
        Freq temp=new Freq(ch,hm.get(ch));
        pq.add(temp);
       }
       StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Freq top=pq.poll();
            char ch=top.ch;
            int cnt=top.value;
            int cntToBeAdded=Math.min(cnt,repeatLimit);
            for(int i=0;i<cntToBeAdded;i++){
                sb.append(ch);
            }
            if(cnt>repeatLimit){
                if(pq.isEmpty()){
                    break;
                }
            Freq top2=pq.poll();
            char ch2=top2.ch;
            int cnt2=top2.value;
            sb.append(ch2);
            cnt2--;
            if(cnt2>0){
                pq.add(new Freq(ch2,cnt2));
            }
            pq.add(new Freq(ch,cnt-repeatLimit));

            }


        }
        return sb.toString();
    }
}

class Freq{
    char ch;
    int value;
    Freq(char ch,int value){
        this.ch=ch;
        this.value=value;
    }
}
