/*
LeetCode Link: https://leetcode.com/problems/count-square-sum-triples/?envType=daily-question&envId=2026-04-24
*/

class Solution {
    public int countTriples(int n) {
        if(n < 3)
        return 0;
        int a, b, c, count = 0;
        for(a = 1; a<=n; a++)
        {
            for(b = 2; b<= n; b++)
            {
                for(c=3; c<=n; c++)
                {
                    if( a*a + b*b == c*c)
                    {
                        count++;  
                    }
                }
            }
        }
        return count;
    }
}
