// https://leetcode.com/problems/binary-subarrays-with-sum/

// Problem Statement

// Given a binary array nums and an integer goal, return the number of non-empty subarrays with sum equal to goal.

// Important Concept

// Since the array contains only 0 and 1:

// sum of window = count of 1's in the window

// So we can use sliding window.

// Main Formula

// exactly(goal)

// atMost(goal) - atMost(goal - 1)


class Solution {
    public int atmost(int[] nums,int goal){
        if(goal < 0){
            return 0;
        }
        int n=nums.length;
        int l=0;
        int ans=0;
        int temp=0;
        for(int r=0;r<n;r++){
            temp+=nums[r];
            while(temp>goal){
                temp-=nums[l];
                
                l++;
            }
               
            ans+=r-l+1;
            
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int finalans=atmost(nums,goal)-atmost(nums,goal-1);
        
            return finalans;
    }
}
