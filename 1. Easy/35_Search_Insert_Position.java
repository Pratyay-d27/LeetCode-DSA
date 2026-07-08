class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = Arrays.binarySearch(nums, target);
        if(n >= 0)
        return n;

        for(int k = 0; k<nums.length; k++)
        {
            if(nums[k] == target)
            return k;
            else if(nums[k] > target)
            return k;
        }
        return nums.length;
    }
}
