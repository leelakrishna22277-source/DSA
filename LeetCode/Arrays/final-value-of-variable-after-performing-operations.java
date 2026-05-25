// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int sum=0;
        for(int i=0;i<operations.length;i++){
         String temp=operations[i];
         if(temp.equals("X++")|| temp.equals("++X")){
            sum+=1;
         }
         else{
            sum-=1;
         }
        }
        return sum;
    }
}
