//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/

class Solution {
    public int minimumDifference(int[] nums, int k) {
       int n=nums.length;
       int dif=Integer.MAX_VALUE;
       Arrays.sort(nums);
      
       for(int i=0;i<n-k+1;i++){
           int j=i+k-1;
           int curdif=nums[j]-nums[i];
           dif=Math.min(curdif,dif);
       }
       
       return dif;
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        int[] arr = {9,4,1,7};
        int sl = 2;
        int n = arr.length;

        int dif = Integer.MAX_VALUE;

        Arrays.sort(arr);

        int l = 0;

        for(int r = 0; r < n; r++) {

            al.add(arr[r]);

            if(r - l + 1 > sl) {
                al.remove(Integer.valueOf(arr[l]));
                l++;
            }

            if(al.size() == sl) {
                int max = Collections.max(al);
                int min = Collections.min(al);

                dif = Math.min(dif, max - min);
            }
        }

        System.out.println(dif);
    }
}
