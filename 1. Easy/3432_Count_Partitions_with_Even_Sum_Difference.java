class Solution {
    public int countPartitions(int[] nums) {
        for(int i = 1; i<nums.length; i++)
        {
            nums[i] += nums[i-1];
        }
        int count = 0, total = nums[nums.length-1];
        for(int i = 0 ;i<nums.length-1; i++)
        {
            int part1 = nums[i], part2 = Math.abs(total - nums[i]);
            int diff = Math.abs(part1 - part2);
            if(diff % 2 == 0)
            count++;
        }
        return count;
    }
}
