// Brute 
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i<nums.length; i++)
        {
            int key = nums[i], sum = 0;
            while(key > 0)
            {
                int d = key % 10;
                sum += d;
                key = key/10;
            }
            if(sum == i)
            return i;
        }
        return -1;
    }
}
