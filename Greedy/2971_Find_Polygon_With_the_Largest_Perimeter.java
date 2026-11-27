class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long ans = -1, cumSum = nums[0] + nums[1];
        for(int i = 2; i<n; i++)
        {
            if(nums[i] < cumSum)
            ans = 1L * nums[i] + cumSum;

            cumSum += 1L * nums[i]; 
        }
        return ans;
    }
}
