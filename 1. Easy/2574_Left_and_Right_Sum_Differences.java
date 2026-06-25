class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length, sum = 0, sum2 = 0;
        //declaration of right and left arrays
        int left[] = new int[n];
        int right[] = new int[n];
        for(int i = 1; i<n; i++)
        {
            sum += nums[i-1];
            left[i] = sum;

            sum2 += nums[n-i];
            right[n-1-i] = sum2;
        }
        for(int i = 0; i<n; i++)
        nums[i] = Math.abs(left[i] - right[i]);
        
        return nums;
    }
}
