class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;;
        int start = 0;
        for(int len = l; len<=r; len++)
        {
            start = 0;
            //it will calculate sum from start to start + len - 1;
            for(int count = 1; count<=nums.size() - len + 1; count++)
            {
                int add = sum(start, start+len-1, nums);
                if(add > 0)
                min = Math.min(min, add);
                start++;
            }
        }
        return min == Integer.MAX_VALUE?-1:min; // return min sum > 0 else return -1
    }
    int sum(int i, int j, List<Integer> nums)
    {
        int add = 0;
        for(int k = i; k<=j; k++)
        {
            add += nums.get(k);
        }
        return add;
    }
}
