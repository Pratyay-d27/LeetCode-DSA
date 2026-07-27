class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for(int ele: nums)
        {
            if(ele > max1)
            {
                max2 = max1;
                max1 = ele;
            }
            else if(ele > max2)
            max2 = ele;
        }
        return (max1-1) * (max2-1);
    }
}
