// https://leetcode.com/problems/valid-parentheses/


class Solution {
    public boolean isValid(String s) {
        StringBuilder sb=new StringBuilder(s);
        boolean b=true;
        // String s=;
        for(int i=0;i<sb.length()-1;i++){
            if((sb.charAt(i)=='(' && sb.charAt(i+1)==')')){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i=-1;

                
            }
            else if(sb.charAt(i)=='[' && sb.charAt(i+1)==']'){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                         i=-1;

            }
            else if(sb.charAt(i)=='{' && sb.charAt(i+1)=='}'){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                        i=-1;

            }
        
        }
        if(sb.length()==0){
            b=true;
        }
        else{
            b=false;
        }
        return b;
    }
}
