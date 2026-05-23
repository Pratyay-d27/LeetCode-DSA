/*
LeetCode Link: https://leetcode.com/problems/rotate-function/?envType=daily-question&envId=2026-05-01
*/

class Solution {
    public int maxRotateFunction(int[] nums) {
        int f = 0, sum = 0, n = nums.length;
        for(int i = 0; i<n; i++)
        {
            sum += nums[i];
            f = f + (i * nums[i]);
        }
        ///calculate further f's
        int result = f;
        for(int k = 0; k<= n-1; k++)
        {
            int newF = f + sum - (n * nums[n-1-k]);
            result = Math.max(result, newF);
            f = newF;
        }
        return result;
    }
}
