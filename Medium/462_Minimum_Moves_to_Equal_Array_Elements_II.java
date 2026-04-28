/*
LeetCode Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
*/

class Solution {
    public int minMoves2(int[] nums) {
        //sort the list
        Arrays.sort(nums);
        //the middlemost/2 middlemost elements will be used 
        int count1 = 0, count2 = 0;
        //when list size is even = select 2 middlemost elements
        if(nums.length % 2 == 0)//even
        {
            int mid1 = nums[(nums.length/2) - 1];
            int mid2 = nums[nums.length/2];
            for(int i = 0; i<nums.length; i++)
            {
                int key = nums[i];
                count1 += Math.abs(key - mid1);
                count2 += Math.abs(key - mid2);
            }
            return Math.min(count1, count2);
        }
        //when odd
        else
        {
            count2 = 0;
            int mid = nums[nums.length/2];
            for(int i = 0; i<nums.length; i++)
            {
                int key = nums[i];
                count2 += Math.abs(key - mid);
            }
            return count2;
        }
    }
}
