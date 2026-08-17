class Solution {
    int prefixSum[];
    int dp[][];
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        prefixSum = new int[n];
        dp = new int[n+1][n+1];
        
        //base case 
        if(n == 1)
        return 0;

        //rest of the code 
        prefixSum[0] = stoneValue[0];
        for(int i = 1; i<n; i++)
        prefixSum[i] = stoneValue[i] + prefixSum[i-1];

        return solve(0, n-1);
    }
    int solve(int l, int r)
    {
        if(l >= r)
        return 0;

        if(dp[l][r] != 0)
        return dp[l][r];

        int score = 0;
        for(int mid = l; mid<r; mid++)
        {
            int leftSum = 0, rightSum = 0;
            if(l-1 >= 0)
            leftSum = prefixSum[mid] - prefixSum[l-1];
            else
            leftSum = prefixSum[mid];
            rightSum = prefixSum[r] - prefixSum[mid];

            if(leftSum < rightSum)
            score = Math.max(score, leftSum + solve(l, mid));
            else if(rightSum < leftSum)
            score = Math.max(score, rightSum + solve(mid+1, r));
            else 
            {
                score = Math.max(score, Math.max(leftSum + solve(l, mid), rightSum + solve(mid+1, r)));
            }
        }
        return dp[l][r] = score;
    }
}
