// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

class Solution {
    public int[] replaceElements(int[] arr) {
        

        int n = arr.length;

        int temp[] = new int[n];

        int k = 0;
        int rightmax=-1;
        int prev=arr[n-1];

        for(int i=n-1;i>=0;i--){
            prev=arr[i];
            arr[i]=rightmax;
            rightmax=Math.max(rightmax,prev);

        }

           
        return arr;
    }
}
