/*
LeetCode Link: https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/?envType=daily-question&envId=2026-04-19
*/

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;//nums1
        int j = 0;//nums2
        int result = Integer.MIN_VALUE;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i] > nums2[j])
            i++;
            else
            {
                result = Math.max(result, (j-i));
                j++;
            }
        }
        return result < 0?0:result;
    }
}
