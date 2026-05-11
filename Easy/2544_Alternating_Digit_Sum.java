/*
LeetCode Link: https://leetcode.com/problems/alternating-digit-sum/
*/

class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        int counter = 1;
        for(char ch: s.toCharArray())
        {
            sum += ((ch - '0')*counter);
            counter *= -1;
        }
        return sum;
    }
}
