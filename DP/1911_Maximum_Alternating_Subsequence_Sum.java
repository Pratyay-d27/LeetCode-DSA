class Solution {
    public long t[][] = new long[100001][2];
    public long maxAlternatingSum(int[] nums) {
        return solve(nums, 0, 1);
    }
    public long solve(int nums[], int i, int isEven)
    {
        //base case 
        if(i >= nums.length)
        return 0; 

        if(t[i][isEven] != 0)
        return t[i][isEven];

        //rest of the code 
        long num = nums[i];
        if(isEven == 0)
        num *=-1;

        long take = num + solve(nums, i+1, 1 - isEven);
        long skip = solve(nums, i+1, isEven);

        return t[i][isEven] = Math.max(take, skip);
    }
}

//Bottom-Up DP Solution
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long dp[][] = new long[n+1][2];
        for(int i = 1; i<=n; i++)
        {//0 = even, 1 = odd
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] - nums[i-1]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + nums[i-1]);
        }
        return Math.max(dp[n][0], dp[n][1]);
    }
}
