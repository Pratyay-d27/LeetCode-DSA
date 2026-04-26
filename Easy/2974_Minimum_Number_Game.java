/*
LeetCode Link: https://leetcode.com/problems/minimum-number-game/
*/

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1, n = nums.length;
        while(i<n && j<n)
        {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i+=2;
            j+=2;
        }
        return nums;
    }
}
