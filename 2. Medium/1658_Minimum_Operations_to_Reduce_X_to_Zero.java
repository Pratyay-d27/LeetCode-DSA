class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length, sum = 0;
        for(int ele: nums)
        sum += ele;

        //base case 
        if(sum < x)
        return -1;

        int key = sum - x;
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        sum = 0;
        while(j < n)
        {
            sum += nums[j];
            while(sum > key)
            {
                sum -= nums[i++];
            }

            if(sum == key)
            max = Math.max(max, j-i+1);

            j++;
        }
        return max == Integer.MIN_VALUE?-1:n - max;
    }
}
