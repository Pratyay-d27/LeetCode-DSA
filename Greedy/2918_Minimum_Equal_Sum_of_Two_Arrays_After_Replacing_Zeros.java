class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long zero1 = 0, sum1 = 0, zero2 = 0, sum2 = 0;
        for(int ele: nums1)
        {
            sum1 += ele;
            if(ele == 0)
            zero1++;
        }
        for(int ele: nums2)
        {
            sum2 += ele;
            if(ele == 0)
            zero2++;
        }
        //System.out.println(sum1 + " "+ sum2);
        sum1 += zero1;
        sum2 += zero2;
        if(zero1 == 0 && sum2 > sum1)
        return -1;
        if(zero2 == 0 && sum1 > sum2)
        return -1;

        return Math.max(sum1, sum2);
    }
}
