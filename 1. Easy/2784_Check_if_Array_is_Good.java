/*
LeetCode Link: https://leetcode.com/problems/check-if-array-is-good/?envType=daily-question&envId=2026-05-14
*/

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        //base case 
        if(n == 1)
        return false;
        if(nums.length == 2)
        {
            if(nums[n-1] == nums[n-2] && nums[n-1] == 1)
            return true;
            else 
            return false;
        }

        //rest of the code 
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        for(int i = 0; i<n-2; i++)
        {
            if(nums[i] != (i+1))
            return false;
        }
        if(nums[n-1] != nums[n-2] || nums[n-1] != max || nums[n-3] >= nums[n-2] )
        return false;
        if(nums[n-3]+1 != nums[n-2])
        return false;
        return true;
    }
}

 
