class Solution {
    int MOD = 1000000007; //used for modulus  
    public int maxSum(List<Integer> nums, int k) {
        int count[] = new int[32];
        for(int ele: nums)
        {
            for(int b = 0; b<32; b++)
            {
                if((ele & (1 << b)) != 0)
                count[b]++;
            }
        }
        //count array is ready
        long result = 0;
        while(k-- > 0)
        {
            long curr = 0;
            for(int b = 0; b<32; b++)
            {
                if(count[b] > 0)
                {
                    count[b]--;
                    curr = curr | (1L << b);
                }
            }
            result = (result + curr*curr) % MOD;
        }
        return (int) result;
    }
}
