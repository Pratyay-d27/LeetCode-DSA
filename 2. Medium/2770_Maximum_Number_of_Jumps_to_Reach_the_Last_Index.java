/*
LeetCode Link: https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/?envType=daily-question&envId=2026-05-10
*/

class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int t[] = new int[n+1];
        for(int i = 0; i<n+1; i++)
        t[i] = Integer.MIN_VALUE;
        int result = solve(0, nums, target, t);

        return result<0?-1:result;
    }
    static int solve(int i, int nums[], int target, int t[])
    {
        //base case 
        if(i == nums.length-1)
        return t[i] = 0;

        //memioze
        if(t[i] != Integer.MIN_VALUE)
        return t[i];

        int result = Integer.MIN_VALUE;
        for(int j = i+1; j<nums.length; j++)
        {
            if(Math.abs(nums[j] - nums[i]) <= target)
            {
                int temp = 1 + solve(j, nums, target, t);
                result = Math.max(result, temp);
            }
        }
        return t[i] = result;
    }
}
