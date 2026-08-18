class Solution {
    public int largestInteger(int[] nums, int k) {
        int freq[] = new int[51];
        
        int max = -1;
        for(int ele: nums)
        {
            max = Math.max(ele, max);
            freq[ele]++;
        }
        if(k == 1)
        {
            for(int i = freq.length-1; i>=0; i--)
            {
                if(freq[i] == 1)
                return i;
            }
            return -1;
        }
        else if(k == nums.length)
        {
            return max;
        }

        Arrays.fill(freq, 0);
        for(int i = 0; i<=nums.length-k; i++)
        {
            for(int j = i; j<i+k; j++)
            {
                freq[nums[j]]++;
            }
        }
        for(int i = freq.length-1; i>=0; i--)
        {
            if(freq[i] == 1)
            return i;
        }
        return -1;
    }
}
