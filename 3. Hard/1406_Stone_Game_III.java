// recusrion + memoization 
class Solution {
    int dp[] = new int[50002];
    public String stoneGameIII(int[] stoneValue) {
        Arrays.fill(dp, Integer.MIN_VALUE);
        int res = solve(0, stoneValue);
        if(res > 0)
        return "Alice";
        else if(res < 0)
        return "Bob";
        else 
        return "Tie";
    }
    int solve(int i, int values[])
    {
        //base case 
        if(i >= values.length)
        return 0;

        if(dp[i] != Integer.MIN_VALUE)
        return dp[i];

        int result = values[i] - solve(i+1, values);
        if(i+1 < values.length)
        result = Math.max(result, values[i] + values[i+1] - solve(i+2, values));
        if(i+2 < values.length)
        result = Math.max(result, values[i] + values[i+1] + values[i+2] - solve(i+3, values));

        return dp[i] = result;
    }
}
