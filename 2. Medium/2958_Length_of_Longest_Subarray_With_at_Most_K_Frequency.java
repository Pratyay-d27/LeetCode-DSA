class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while(j<nums.length)
        {
            if(map.containsKey(nums[j]) == false)
            map.put(nums[j], 1);
            else 
            map.put(nums[j], map.get(nums[j])+1);
 
            while(map.get(nums[j]) > k)
            {
                map.put(nums[i], map.get(nums[i])-1);
                i++;
            }
            
            result = Math.max(result, j-i+1);
            j++;
        }
        return result;
    }
}
