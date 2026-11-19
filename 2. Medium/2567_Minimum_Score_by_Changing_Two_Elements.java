class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        //base case 
        if(n == 3)
        return 0;

        //rest of the code 
        Arrays.sort(nums);
        int first = nums[n-1] - nums[2];
        int second = nums[n-2] - nums[1];
        int third = nums[n-3] - nums[0];
        return Math.min(first, Math.min(second, third)); // return minimum among three 
    }
}
