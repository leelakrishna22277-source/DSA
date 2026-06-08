// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/


class Solution {
    public int maxDepth(String s) {

       Stack<Character> st=new Stack<>();
        int sum=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else if(s.charAt(i)==')'){
               st.pop();
            }
            max=Math.max(st.size(),max);
        }
        return max; 

    }
}
