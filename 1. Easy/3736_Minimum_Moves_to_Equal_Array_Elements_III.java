class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n-1];
        int count = 0;
        for(int ele: nums)
        count += max - ele;

        return count;
    }
}
