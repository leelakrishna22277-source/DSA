// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

class Solution {
    public int maxDepth(String s) {

       int sum=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                sum+=1;
            }
            else if(s.charAt(i)==')'){
                sum-=1;
            }
            max=Math.max(max,sum);
        }
        return max;  

    }
}
