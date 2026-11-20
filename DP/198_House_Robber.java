///Bottom Up Solution
class Solution {
    public int rob(int[] nums) {
        int t[] = new int[101];
        t[0] = 0;
        t[1] = nums[0];
        for(int i = 2; i<=nums.length; i++)
        {
            int steal = nums[i-1] + t[i-2];
            int skip = t[i-1];
            t[i] = Math.max(steal, skip);
        }
        return t[nums.length];
    }
}

---------------------------------------------------------------------------------------------------------------------------
    
// Alternate Approach: of take and skip with adjacent house taken or not taken condition check 
class Solution {
    int dp[][] = new int[101][2];
    public int rob(int[] nums) {
        for(int ele[]: dp)
        Arrays.fill(ele, -1);

        return solve(0, 0, nums);
    }
    int solve(int idx, int adjacent, int[] nums)
    {
        //adjacent = false = 0 means last house not robbed and true = 1 means last house robbed 
        //base case 
        if(idx == nums.length)
        return 0;

        if(dp[idx][adjacent] != -1)
        return dp[idx][adjacent];

        int skip = 0, take = 0;
        //take 
        if(adjacent == 0)
        take = nums[idx] + solve(idx+1, 1, nums);
        //skip
        skip = solve(idx+1, 0, nums);

        return dp[idx][adjacent] = Math.max(take, skip);
    }
}
