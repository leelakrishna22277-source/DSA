// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

class Solution {
     public  int bsleftmost(int[] nums, int target) {

        int n = nums.length;

        int l = 0;
        int r = n - 1;

        while(l <= r) {

            int mid = l + (r - l) / 2;
            if(target <= nums[mid]) {
                r = mid - 1;
            }

        

            else if(target > nums[mid]) {
                l = mid + 1;
            }

        }
        

        return l;
    }
    public int maximumCount(int[] nums) {
    int n=nums.length;

        int zero = bsleftmost(nums, 0);
        int one = bsleftmost(nums, 1);
        int positivecount=n-one;
        int negativecount=zero;
        int maxcount=Math.max(positivecount,negativecount);
        return maxcount;
    }
}
