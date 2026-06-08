// https://leetcode.com/problems/clear-digits/

class Solution {
    public String clearDigits(String s) {
        

     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++){
        sb.append(s.charAt(i)); 

         if(Character.isDigit(s.charAt(i))){
             sb.deleteCharAt(sb.length() - 1); 

             sb.deleteCharAt(sb.length() - 1); 

         }
     }
     return sb.toString();
    }
}
