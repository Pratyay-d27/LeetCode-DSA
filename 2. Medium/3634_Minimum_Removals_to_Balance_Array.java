class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length == 1)
        return 0;
        Arrays.sort(nums);
        int i = 0, j = 0, length = 0, max = 0;
        while(j<nums.length)
        {
            if(nums[j] <= (long)nums[i]*k)
            {
                length++;
                j++;
            }
            else
            {
                max = Math.max(max, length);
                i++;
                length = j-i;
            }
        }   
        max = Math.max(max, length);
        return nums.length-max;
    }
}
