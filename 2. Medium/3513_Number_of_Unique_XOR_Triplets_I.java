class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<=2)
        return n;

        //when n >= 3
        int count = 0;
        while(n>0)
        {
            n = n >> 1;
            count++;
        }
        return (int)Math.pow(2, count);
    }
}
