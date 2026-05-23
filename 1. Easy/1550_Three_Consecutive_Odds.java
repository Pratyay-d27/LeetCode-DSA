/*
LeetCode Link: https://leetcode.com/problems/three-consecutive-odds/
*/

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int i, p;
        p=0;
        for(i=0;i<n;i++) 
        {
            if(arr[i] % 2 == 1)
            {
                p=p+1;
            }
            else
            p=0;
            if (p ==3)
            return true;
        }
        return false;
    }
}
