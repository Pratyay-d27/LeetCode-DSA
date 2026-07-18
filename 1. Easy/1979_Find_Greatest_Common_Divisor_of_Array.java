class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(max, min);
    }
    static int gcd(int a, int b)
    {
        int result = 1;
        for(int i = 1; i<=Math.min(a, b); i++)
        if(a%i == 0 && b%i == 0)
        result = i;
        return result;
    }
}
