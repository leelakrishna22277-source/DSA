// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
       int maxlen=0;
       for(int i=0;i<n;i++){
           String temp="";
           for(int j=i;j<n;j++){
               if(!temp.contains(String.valueOf(s.charAt(j)))){
               temp+=s.charAt(j);
               maxlen=Math.max(temp.length(),maxlen);
                   
               }else{
                   break;
               }
               
           }
       }
       return maxlen;
    }
}
