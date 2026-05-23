/*
LeetCode Link: https://leetcode.com/problems/count-digit-appearances/
*/
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        char ch = (char) (digit + '0'); 
        for(int i = 0; i<nums.length; i++)
        {
            String s = String.valueOf(nums[i]);
            for(char ele: s.toCharArray())
            {
                if(ele == ch)
                count++;
            }
        }
        return count;
    }
}
