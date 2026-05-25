// https://leetcode.com/problems/find-maximum-number-of-string-pairs/

class Solution {

    public String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {

       int count=0;
       for(int i=0;i<words.length;i++){
            String a=words[i];
            if(a.equals("0")){
                continue;
            }
        for(int j=i+1;j<words.length;j++){
            String b=words[j];
            String revb=reverse(b);
            if(a.equals(revb)){
                     count++;
                     words[j]="0";
                     break;
            }
        }
       }
       return count;
    }
}
