/*
LeetCode Link: https://leetcode.com/problems/minimum-distance-to-the-target-element/description/?envType=daily-question&envId=2026-04-13
*/
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == target)
            min =  Math.min(Math.abs(i - start), min);
        }
        return min;
    }
}
