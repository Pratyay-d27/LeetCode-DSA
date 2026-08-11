class Solution {
    public int missingInteger(int[] nums) {
        //base case 
        if(nums.length == 1)
        return nums[0]+1;

        int preSum = 0;
        int freq[] = new int[51];
        if(nums[1] - nums[0] == 1)
        {
            preSum += nums[0];
            for(int i = 1; i<nums.length; i++)
            {
                if( nums[i] - nums[i-1] == 1)
                preSum += nums[i];
                else 
                break;
            }
        }
        else 
        preSum = nums[0];
        for(int i = 0; i<nums.length; i++)
        freq[nums[i]]++;

        if(preSum > 50)
        return preSum;
        if(preSum == 50)
        return 51;
        while(preSum <= 50)
        {
            if(freq[preSum] == 0)
            return preSum;
            else 
            preSum++;
        }
        return preSum;
    }
}
