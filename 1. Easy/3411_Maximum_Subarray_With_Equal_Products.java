// Brute force approach
class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int iprod = 1, jprod = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            iprod = nums[i];
            jprod = iprod;
            for(int j = i+1; j<n; j++)
            {
                int h = hcf(i, j, nums);
                int l = lcm(i, j, nums);
                jprod *= nums[j];
                if(jprod == (h*l))
                max = Math.max(max, j-i+1);
            }
        }
        return (max == Integer.MIN_VALUE)?1:max;
    }

    int hcf(int a, int b, int[] nums)
    {
        for(int i = 10; i>=1; i--)
        {
            boolean check = true;
            for(int j = a; j<=b; j++)//check for elements of index a to b in nums
            {
                if(nums[j] >= i && nums[j] % i == 0)
                check = true;
                else 
                {
                    check = false;
                    break;
                }
            }
            if(check)
            return i;
        }
        return 1;
    }

    int lcm(int a, int b, int[] nums)
    {
        for(int i = 1; i<=100000; i++)
        {
            boolean check = true;
            for(int j = a; j<=b; j++)
            {
                if(i>=nums[j] && i % nums[j] == 0)
                check = true;
                else 
                {
                    check = false;
                    break;
                }
            }
            if(check)
            return i;
        }
        return -1;
    }
}

