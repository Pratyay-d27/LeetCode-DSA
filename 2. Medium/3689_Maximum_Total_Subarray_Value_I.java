//Basic approach using for loop and max and min elements 
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] > max)
            max = nums[i];
            if(nums[i] < min)
            min = nums[i];
        }
        return (long) k * (max-min);
    }
}

//Using sorting 
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        return (long) k * (nums[nums.length-1] - nums[0]);
    }
}
