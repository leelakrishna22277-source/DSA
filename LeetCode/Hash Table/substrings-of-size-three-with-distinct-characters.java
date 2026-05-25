// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/

class Solution {
    public int countGoodSubstrings(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0;
        int k=3;
        int n=s.length();
        int l=0;
        for(int r=0;r<n;r++)
        {

               char ch=s.charAt(r);
               hm.put(ch,hm.getOrDefault(ch,0)+1);
            
             if(r-l==k)
             {
              char temp=s.charAt(l);
              hm.put(temp,hm.get(temp)-1);
              if(hm.get(temp)==0){
                hm.remove(temp);
              }
              l++;
             }
             if(hm.size()==k){
                count+=1;
             }

        } 
        
           return count;
    }
}
    //     HashSet<Character> hs=new HashSet<>();
    //     int count=0;
    //     int k=3;
    //     for(int i=0;i<s.length();i++){
    //         hs.add(s.charAt(i));
    //     }
    //     if(hs.size()==k){
    //        return  count+=1;
    //     }
    //     else{
    //                     return 0;

    //     }
    //     } 
    // public int countGoodSubstrings(String s) {
    //     int n=s.length();
    //     int count=0;
    //     int k=3;
    //    for(int i=0;i<=n-k;i++){
    //     String temp= s.substring(i,i+3);
    //     count+=func(temp);
    //    }
       
//--------------------------------------------------------------------
// Direct checking best 
    //    int n=s.length();
    //     int count=0;
    //     int k=3;
    //    for(int i=0;i<=n-k;i++){
        
    //     char a=s.charAt(i);
    //     char b=s.charAt(i+1);
    //     char c=s.charAt(i+2);
    //      if (a != b && b != c && a != c) {
    //             count++;
    //         }
    //    }
        // without hashmap 
        //----------------------------------------------------------------
        // int sl=3;
        // int n=s.length();
        // int count=0;
        // for(int i=0;i<n-2;i++){
        //     int j=i+2;
        //         if(j-i==sl-1){
        //             String temp="";
        //             for(int k=i;k<=j;k++){
                        
        //         temp+=s.charAt(k);
        //             }
                   
        //             if(temp.charAt(0)!=temp.charAt(1) && temp.charAt(1)!=temp.charAt(2) && temp.charAt(0)!=temp.charAt(2)){
        //                 count+=1;
                   
        //             }
                   
                    
        //         }
        // }  

        //=============================================================


        // // with Hashmap and sliding window 
        // HashMap<String,Integer> hm=new HashMap<>();
        // int count=0;
        // int sl=3;
        // int n=s.length();
        // int l=0;
        // // String temp="";
        // StringBuilder temp=new StringBuilder();
        // for(int r=0;r<n;r++){
        //     temp.append(s.charAt(r));
        //     if(r-l+1>sl){
        //       temp = temp.deleteCharAt(0);
        //       l++;
        //     }
        //     if(r-l+1==sl){
        //         hm.put(temp.toString(),hm.getOrDefault(temp.toString(),0)+1);
        //     }
        // }
            
        // for(String keys:hm.keySet()){
        //     if(keys.charAt(0) !=keys.charAt(1) &&keys.charAt(0) !=keys.charAt(2) && keys.charAt(1) !=keys.charAt(2)){
        //         count+=hm.get(keys);
        //     }
        // }
        
