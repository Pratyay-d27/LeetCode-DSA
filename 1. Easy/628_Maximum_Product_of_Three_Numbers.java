class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int max = Integer.MIN_VALUE;
        
        if(n <= 6)
        {
            for(int i = 0; i<=n; i++)
            {
                for(int j = i+1; j<=n; j++)
                {
                    for(int k = j+1; k<=n; k++)
                    {
                        max = Math.max(nums[i] * nums[j] * nums[k], max);
                    }
                }
            }
            return max;
        }

        //for n>=6
        int arr[] = {nums[0], nums[1], nums[2], nums[n], nums[n-1], nums[n-2]};
        max = Integer.MIN_VALUE;
        for(int i = 0; i<6; i++)
        {
            for(int j = i+1; j<6; j++)
            {
                for(int k = j+1; k<6; k++)
                {
                    max = Math.max(arr[i] * arr[j] * arr[k], max);
                }
            }
        }
        return max;
    }
}
