class Solution {
    public int maxDigitRange(int[] nums) {
        int max = -1;
        int arr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            arr[i] = range(nums[i]);
            max = Math.max(max, arr[i]);
        }

        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == max)
            {
                sum += nums[i];
            }
        }
        return sum;
    }
    int range(int n)
    {
        int max = -1, min = 10;
        while(n>0)
        {
            int d = n % 10;
            max = Math.max(max, d);
            min = Math.min(min, d);
            n = n / 10;
        }
        return max - min;
    }
}
