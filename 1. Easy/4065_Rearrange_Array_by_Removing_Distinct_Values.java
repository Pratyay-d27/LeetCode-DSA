// Brute force solution
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int freq[] = new int[101];
        int sum = nums.length;
        for(int ele: nums)
        {
            freq[ele]++;
        }

        int i = 0;
        while(sum > 0)
        {
            for(int j = 0; j<101; j++)
            {
                if(freq[j] != 0)
                {
                    nums[i++] = j;
                    freq[j]--;
                    sum--;
                }
            }
        }
        
        return nums;
    }
}
