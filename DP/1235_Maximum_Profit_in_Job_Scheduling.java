class Solution {
    int dp[] = new int[50002]; // memoization 1D array
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Arrays.fill(dp, -1);

        int n = startTime.length;
        int nums[][] = new int[n][3];
        int k = 0;
        for(int ele[]: nums)
        {
            ele[0] = startTime[k];
            ele[1] = endTime[k];
            ele[2] = profit[k++];
        }
        //now sort the 2d array based on start time
        Arrays.sort(nums, (a,b)->Integer.compare(a[0], b[0]));

        return solve(0, nums);
    }
    int solve(int idx, int[][] nums)
    {
        if(idx >= nums.length || idx == -1)
        return 0;
        
        if(dp[idx] != -1)
        return dp[idx];

        int take = 0, skip = 0;
        //here take
        int next = nextIndex(nums, idx+1, nums[idx][1]);
        take = nums[idx][2] + solve(next, nums);
        //here skip
        skip = solve(idx+1, nums);

        return dp[idx] = Math.max(take, skip);
    }
    int nextIndex(int [][] nums, int l, int currJobEnd)
    {
        //this will return index whose starting point is >= current job ending point 
        int r = nums.length-1;
        int result = -1;
        while(l <= r)
        {
            int mid = l + (r-l) / 2;
            if(nums[mid][0] >= currJobEnd)
            {
                result = mid;
                r = mid-1;
            }
            else 
            l = mid+1;
        }
        return result;
    }
}
