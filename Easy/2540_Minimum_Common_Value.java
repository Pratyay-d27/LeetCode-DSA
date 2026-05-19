/*
LeetCode Link: https://leetcode.com/problems/minimum-common-value/?envType=daily-question&envId=2026-05-19
*/

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //i -- nums1 and j -- nums2
        int i = 0, j = 0;

        //edge case -- optimization
        if(nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0])
        return -1;

        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i] == nums2[j])
            return nums1[i];
            else if(nums1[i] < nums2[j])
            i++;
            else
            j++;
        }
        return -1;
    }
}
