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
