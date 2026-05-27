// https://leetcode.com/problems/longest-substring-without-repeating-characters/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
       int n=s.length();
       int maxlen=0;
       int l=0;
        for(int r=0;r<n;r++){
            
                
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
                
            }
           hs.add(s.charAt(r));

            maxlen=Math.max(maxlen,hs.size());
        }
    //     int n=s.length();
    //    int maxlen=0;
    //    for(int i=0;i<n;i++){
    //        String temp="";
    //        for(int j=i;j<n;j++){
    //            if(!temp.contains(String.valueOf(s.charAt(j)))){
    //            temp+=s.charAt(j);
    //            maxlen=Math.max(temp.length(),maxlen);
                   
    //            }else{
    //                break;
    //            }
               
    //        }
    //    }
       return maxlen;
    }
}
