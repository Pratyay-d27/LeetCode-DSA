/*
LeetCode Link: https://leetcode.com/problems/mirror-distance-of-an-integer/?envType=daily-question&envId=2026-04-18
*/

class Solution {
    public int mirrorDistance(int n) {
        String s = String.valueOf(n);
        char ch[] = s.toCharArray();
        int i = 0, j = ch.length-1;
        while(i < j)
        {
            char ele = ch[i];
            ch[i] = ch[j];
            ch[j] = ele;
            i++;j--;
        }
        String str = new String(ch);
        int ans = Integer.valueOf(str);
        return Math.abs(ans - n);
    }
}
