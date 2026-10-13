class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0; i<nums.length; i++) // making all numbers positive
        {
            if(nums[i] < 0)
            nums[i] *= -1;
        }
        //now all converted to positive
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        long score = 0;
        while(i<j)  // biggest at j and smallest at i
        {
            score = score + (nums[j]*nums[j]) - (nums[i]*nums[i]);
            i++;
            j--;
        }
        return (i == j)? (score + (nums[i]*nums[i])):score;
    }
}
