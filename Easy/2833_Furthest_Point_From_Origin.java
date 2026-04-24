/*
LeetCode Link: https://leetcode.com/problems/furthest-point-from-origin/?envType=daily-question&envId=2026-04-24
*/

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, space = 0;
        for(int i = 0; i<moves.length(); i++)
        {
            if(moves.charAt(i) == 'L')
            left++;
            else if(moves.charAt(i) == 'R')
            right++;
            else
            space++;
        }
       return Math.abs(left - right) + space;
    }
}
