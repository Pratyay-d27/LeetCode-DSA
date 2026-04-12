/*
LeetCode Link: https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
*/
class Solution {
    public int minTimeToType(String word) {
        int count = 0;
        char ch = 'a';
        for(int i = 0; i<word.length(); i++)
        {
            int min1 = Math.abs(word.charAt(i) - ch);
            int min2 = Math.abs(26 - min1);
            ch = word.charAt(i);
            count += Math.min(min1, min2);
        }
        return count + word.length();
    }
}
