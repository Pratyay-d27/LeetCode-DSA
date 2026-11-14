class Solution {
    int max = Integer.MIN_VALUE;
    public int maxLength(List<String> arr) {
        solve(0, "", arr);
        return max == Integer.MIN_VALUE?0:max;
    }
    void solve(int idx, String str, List<String> arr)
    {
        //base case 
        if(idx >= arr.size())
        {
            int i = 0;
            if(str.length() > 1)
            {
                int nums[] = new int[26];
                for(char ele: str.toCharArray())
                nums[ele - 'a']++;
                for(i = 0; i<nums.length; i++)
                {
                    if(nums[i] >= 2)
                    break;
                }
                if(i == nums.length)
                {
                    max = Math.max(max, str.length());
                }  
            }
            else if(str.length() == 1)
            max = Math.max(max, str.length());
            return;
        }

        int i = 0;
        if(str.length() > 1)
        {
            int nums[] = new int[26];
            for(char ele: str.toCharArray())
            nums[ele - 'a']++;
            for(i = 0; i<nums.length; i++)
            {
                if(nums[i] >= 2)
                break;
            }
            if(i == nums.length)
            {
                max = Math.max(max, str.length());
            }  
        }
        else if(str.length() == 1)
        max = Math.max(max, str.length());

        //take
        solve(idx+1, str + arr.get(idx), arr);
        //skip
        solve(idx+1, str, arr);
    }
}
