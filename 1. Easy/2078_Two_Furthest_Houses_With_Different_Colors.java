/*
LeetCode Link: https://leetcode.com/problems/two-furthest-houses-with-different-colors/?envType=daily-question&envId=2026-04-20
*/

class Solution {
    public int maxDistance(int[] colors) {
        int i = 0, j = colors.length-1;
        while(colors[i] == colors[j])
        i++;
        while(colors[j] == colors[i])
        j--;

        int diff1 = j-i;
        i = 0; j = colors.length-1;
        while(colors[j] == colors[i])
        j--;
        while(colors[i] == colors[j])
        i++;
        int diff2 = j - i;
        return Math.max(diff1, diff2);
    }
}
