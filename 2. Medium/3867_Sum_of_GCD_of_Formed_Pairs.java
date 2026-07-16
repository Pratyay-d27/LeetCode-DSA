class Solution {
    public long gcdSum(int[] nums) {
        int arr[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            max = Math.max(max, nums[i]);
            arr[i] = gcd(max, nums[i]);
        }
        Arrays.sort(arr);
        long sum = 0;
        int i = 0, j = arr.length-1;
        while(i < j)
        {
            sum += gcd(arr[i], arr[j]);
            i++;
            j--;
        }
        return sum;
    }
    public  int gcd(int x, int y) 
    {
        return (y == 0) ? x : gcd(y, x % y);
    }
}
