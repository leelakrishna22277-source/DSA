// https://leetcode.com/problems/decode-the-message/

class Solution {
    public String decodeMessage(String key, String message) {

        HashMap<Character,Character> hm=new HashMap<>();
        String modkey=key.replace(" ","");
        int num=97;
        String decode="";

        for(int i=0;i<modkey.length();i++){
            if(hm.containsKey(modkey.charAt(i))){
                continue;
            }
            else{
                hm.put(modkey.charAt(i),(char)num);
                num++;
            }
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                decode+=' ';
            }
            else{
               decode+= hm.get(message.charAt(i));
            }
        }
        return decode;
    }
}
