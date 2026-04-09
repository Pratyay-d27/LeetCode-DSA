/*
LeetCode Link: https://leetcode.com/problems/robot-return-to-origin/?envType=daily-question&envId=2026-04-09
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0, left = 0;
        for(int i = 0; i<moves.length(); i++)
        {
            if(moves.charAt(i) == 'U')
            up++;
            else if(moves.charAt(i) == 'D')
            up--;
            if(moves.charAt(i) == 'L')
            left++;
            if(moves.charAt(i) == 'R')
            left--;
        }
        if(left == 0 && up == 0)
        return true;
        return false;
    }
}
