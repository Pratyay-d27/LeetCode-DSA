class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length, odd = 0, even = 0;
        int maxEven = -1, maxOdd = -1, minOdd = Integer.MAX_VALUE, minEven = Integer.MAX_VALUE;
        for(int ele: nums1)
        {
            if(ele % 2 == 0)
            {
                even++;
                maxEven = Math.max(maxEven, ele);
                minEven = Math.min(minEven, ele);
            }
            else 
            {
                odd++;
                maxOdd = Math.max(maxOdd, ele);
                minOdd = Math.min(minOdd, ele);
            }
        }
        //best case scenario
        if(odd == n || even == n)
        return true;


        boolean allOdd = false, allEven = false;
        //make all odd
        if(minEven > minOdd)
        allOdd = true;
        return allOdd;
    }
}
