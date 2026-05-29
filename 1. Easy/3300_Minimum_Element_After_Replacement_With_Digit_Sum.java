//Brute Force Approach

class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            int n = nums[i];
            if(n>9)
            {
                n = sum(n);
                nums[i] = n;  
            }
            min = Math.min(min, nums[i]);
        }
        return min;
    }
    int sum(int n)
    {
        int ans = 0;
        while(n>0)
        {
            int d = n%10;
            ans += d;
            n = n/10;
        }
        return ans;
    }
}
