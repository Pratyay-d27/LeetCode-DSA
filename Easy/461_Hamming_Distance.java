/*
LeetCode Link: https://leetcode.com/problems/hamming-distance/
*/

class Solution {
    public int hammingDistance(int x, int y) {
        int i, j, count = 0;
        //base case
        if(x == 0 && y == 0)
        return 0;
        //rest of the code 
        while(x>0 || y>0)
        {
            i = x & 1;
            j = y & 1;
            if(i != j)
            count++;
            x = x >> 1;
            y = y >> 1;
        }
        return count;
    }
}
