class Solution {
    public int minimumDeletions(int[] nums) {
        //base case 
        if(nums.length == 1)
        return nums.length;

        //rest of the code 
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, minIndex = -1, maxIndex = -1, n = nums.length;
        for(int i = 0; i<n; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min)
            {
                min = nums[i];
                minIndex = i;
            }
        }

        int front = Math.max(maxIndex+1, minIndex+1);
        int back = Math.max(n-maxIndex, n-minIndex);

        int maxRemove = -1, minRemove = -1;
        if(maxIndex >= n/2)
            maxRemove = n-maxIndex;
        else 
            maxRemove = maxIndex+1;

        if(minIndex >= n/2)
            minRemove = n-minIndex;
        else 
            minRemove = minIndex+1;
        int middle = maxRemove + minRemove;

        return Math.min(middle, Math.min(front, back));
    }
}
