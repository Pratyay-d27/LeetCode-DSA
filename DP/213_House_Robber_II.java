class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        //base cases
        if(n == 1)
        return nums[0];
        if(n == 2)
        return Math.max(nums[0], nums[1]);

        //rest of the code 
        int t[] = new int[101];
        //steal index 1
        t[1] = nums[0];
        for(int i = 2; i<=n-1; i++)
        {
            int steal = nums[i-1] + t[i-2];
            int skip  = t[i-1];
            t[i] = Math.max(steal, skip);
        }
        int max = t[nums.length-1];

        Arrays.fill(t, 0);
        //skip index 1
        t[2] = nums[1];
        for(int i = 3; i<=n; i++)
        {
            int steal = nums[i-1] + t[i-2];
            int skip  = t[i-1];
            t[i] = Math.max(steal, skip);
        }
        return Math.max(max, t[n]);
    }
}
