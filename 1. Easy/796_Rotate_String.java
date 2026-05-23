/*
LeetCode Link: https://leetcode.com/problems/rotate-string/?envType=daily-question&envId=2026-05-03
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal) == true)
        return true;
        int i = 1;
        String ans = s;
        while(i < s.length())
        {
            ans = ans.substring(1) + ans.charAt(0);
            if(ans.equals(goal))
            return true;
            i++;
        }
        return false;
    }
}
