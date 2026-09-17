class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int nums[] = new int[n];
        Arrays.fill(nums, Integer.MAX_VALUE);
        int i = 0, j = 0, currSum = 0, minLen = Integer.MAX_VALUE, result = Integer.MAX_VALUE;
        while(j<arr.length)
        {
            int len = 0;
            currSum += arr[j];
            while(currSum > target)
            {
                currSum -= arr[i];
                i++;
            }
            
            if(currSum == target)
            {
                len = j-i+1;
                if(i>0 && nums[i-1] != Integer.MAX_VALUE)
                {
                    result = Math.min(result, len+nums[i-1]);
                }
                minLen = Math.min(len, minLen);
            }
            nums[j] = minLen;
            j++;
        }
        return (result == Integer.MAX_VALUE)?-1:result;
    }
}
