// https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
           else  if(operations[i].equals("D")){
                int top=st.peek();
                st.push(top*2);
            }
           else if(operations[i].equals("+")){
                int firstTop=st.peek();
                int secondTop=st.get(st.size()-2);
                st.push(firstTop + secondTop);
            }
            else{
                
            st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
             sum+=st.pop();
        }
        return sum;
    }
}
