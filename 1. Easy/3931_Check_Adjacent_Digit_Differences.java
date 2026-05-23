/*
LeetCode Link: https://leetcode.com/problems/check-adjacent-digit-differences/
*/

class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i = 0; i+1<s.length(); i++)
        {
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i+1) - '0')) > 2)
            return false;
        }
        return true;
    }
}

