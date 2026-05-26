// https://leetcode.com/problems/maximize-the-confusion-of-an-exam/


class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int trues=0;
        int falses=0;
        int l=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if(answerKey.charAt(r)=='T'){
                trues+=1;
            }else{
                falses+=1;
            }
            while(Math.min(trues,falses)>k){
                 if(answerKey.charAt(l)=='T'){
                trues-=1;
            }else{
                falses-=1;
            }
            l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
