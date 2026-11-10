class Solution {
    int dp[][] = new int[302][12]; // memoization dp arra
    public int minDifficulty(int[] jobDifficulty, int d) {
        if(d > jobDifficulty.length)
        return -1;
        
        for(int ele[]: dp)
        Arrays.fill(ele, -1);

        return solve(0, d, jobDifficulty);
    }
    int solve(int idx, int d, int []nums)
    {
        int n = nums.length;
        //base case -- when only 1 day left 
        if(d == 1)
        {
            int max = Integer.MIN_VALUE;
            for(int i = idx; i<n; i++)
            max = Math.max(max, nums[i]);

            return max;
        }

        if(dp[idx][d] != -1)
        return dp[idx][d];

        int max = Integer.MIN_VALUE;
        int finalResult = Integer.MAX_VALUE;
        for(int i = idx; i<=n-d; i++)
        {
            max = Math.max(max, nums[i]);
            int result = max + solve(i+1, d-1, nums);
            finalResult = Math.min(finalResult, result);
        }
        return dp[idx][d] = finalResult;
    }
}
