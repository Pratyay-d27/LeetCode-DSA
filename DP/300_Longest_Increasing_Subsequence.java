//Recursion + Memoization with 2D DP
class Solution {
    int t[][] = new int[2501][2501];
    public int lengthOfLIS(int[] nums) {
        return solve(nums, 0, -1);
    }
    int solve(int nums[], int i, int p)
    {
        //initially i = 0, p = -1
        //base case
        if(i>=nums.length)
        return 0;

        //memoize 
        if(p>-1 && t[i][p] != 0)
        return t[i][p];

        int take = 0, skip = 0;
        if(p == -1 || nums[p] < nums[i])
        take = solve(nums, i+1, i) + 1;
        skip = solve(nums, i+1, p);

        if(p == -1)
        return Math.max(take, skip);
        return t[i][p] = Math.max(take, skip);
    }
}
