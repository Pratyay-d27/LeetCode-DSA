/*LeetCode Link
https://leetcode.com/problems/xor-after-range-multiplication-queries-i/?envType=daily-question&envId=2026-04-08
*/
class Solution {
    static final long M = 1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int m = queries.length, idx;
        for(int i = 0; i<m; i++)
        {
            idx = queries[i][0];
            while(idx <= queries[i][1])
            {
                long d = nums[idx];
                long e = queries[i][3];
                nums[idx] = (int)((d*e) % M);
                idx += queries[i][2];
            }
        }
        int xor = 0;
        for(int i = 0; i < nums.length; i++)
        xor = xor ^ nums[i];
        return xor;
    }
}
