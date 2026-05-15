/*
LeetCode Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/?envType=daily-question&envId=2026-05-15
*/

//Method 1
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int ele: nums)
        min = Math.min(min, ele);
        return min;
    }
}
