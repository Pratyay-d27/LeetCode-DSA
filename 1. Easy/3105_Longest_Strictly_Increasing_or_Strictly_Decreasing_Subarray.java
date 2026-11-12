class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        int size = 1;

        //base case for length =
        if(n == 1)
        return size;

        //for strictly increasing
        while(j < n)
        {
            if(nums[j] > nums[i] && nums[j] > nums[j-1])
            size = Math.max(size, j-i+1);

            if(nums[j-1] >= nums[j])
            i=j;

            j++;
        }  

        //for strictly decreasing 
        i = 0;
        j = 1;
        while(j < n)
        {
            if(nums[j] < nums[i] && nums[j] < nums[j-1])
            size = Math.max(size, j-i+1);

            if(nums[j-1] <= nums[j])
            i=j;

            j++;
        } 

        return size;
    }
}
